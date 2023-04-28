const anos = ['2012', '2010', '2020', '2022', '2035', '2045']

function filtrarAnosMenores(ano) {
    let array = [];
    for (let i = 0; i < anos.length; i++) {
        if (Number(anos[i]) < Number(ano)) {
            array.push(anos[i]);
        }
    }
    return array;
}
console.log(filtrarAnosMenores(2020));


function filtrarAnosMaiores(ano) {
    let array = [];
    for (let i = 0; i < anos.length; i++) {
        if (Number(anos[i]) >= Number(ano)) {
            array.push(anos[i]);
        }
    }
    return array.length;
}
console.log(filtrarAnosMaiores(2022));


function filtrarDivisiveis(numero = 10) {
    let array = [];
    for (let i = 0; i < anos.length; i++) {
        if (Number(anos[i]) % Number(numero) === 0) {
            array.push(anos[i]);
        }
    }
    return array.length;
}
console.log(filtrarDivisiveis());