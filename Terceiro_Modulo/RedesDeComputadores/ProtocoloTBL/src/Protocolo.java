
    public class Protocolo {

        private final byte sync = 0x54;
        private Long source;
        private Long destination;
        private byte[] protocolo;


        public Protocolo(Long source, Long destination) {
            this.source = source;
            this.destination = destination;
        }

        public byte[] encapsularPacote (byte[] payload) {

            CRC8 crc = new CRC8();
            crc.reset();

            int len = 10;
            int size = payload.length;

            protocolo = new byte[size + 11];

            protocolo[0] = sync;
            protocolo[1] = (byte)(source & 0xff);
            protocolo[2] = (byte)((source >> 8) & 0xff);
            protocolo[3] = (byte)((source >> 16) & 0xff);
            protocolo[4] = (byte)((source >> 24) & 0xff);
            protocolo[5] = (byte)(destination & 0xff);
            protocolo[6] = (byte)((destination >> 8) & 0xff);
            protocolo[7] = (byte)((destination >> 16) & 0xff);
            protocolo[8] = (byte)((destination >> 24) & 0xff);
            protocolo[9] = (byte)(size & 0xff);
            protocolo[10] = (byte)((size >> 8) & 0xff);
            for (int i = 0; i < size; i++){

                protocolo[len++] = payload[i];
            }

            crc.update(protocolo);
            protocolo[len] = (byte)crc.getValue();

            return protocolo;
        }


    }

