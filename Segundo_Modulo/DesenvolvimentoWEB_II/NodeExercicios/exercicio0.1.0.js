function cliente(valor, convenio, cartao) {
    if (cartao && convenio) {
        let desconto = valor * 0.15
        console.log('você possui desconto de 15%')
        return valor - desconto;
    } else if (convenio || cartao) {
        let desconto = valor * 0.10
        console.log('você possui desconto de 10%')
        return valor - desconto;
    } else {
        console.log('você não possui desconto')
        return valor;
    }
}

const teste = cliente(20, true, false);
console.log(teste);