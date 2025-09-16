
function detectarOrden(arr: number[]): string {
    const ascendente = arr.every((val, i, a) => i === 0 || a[i - 1] <= val);
    const descendente = arr.every((val, i, a) => i === 0 || a[i - 1] >= val);

    if (ascendente) return "Ascendente";
    else if (descendente) return "Descendente";
    else return "Desordenado";
}
function esAritmetica(arr: number[]): boolean {
    if (arr.length < 2) return false;
    return arr.every((val, i, a) =>
        i < 2 || a[i] - a[i - 1] === a[1] - a[0]
    );
}


function esGeometrica(arr: number[]): boolean {
    if (arr.length < 2 || arr[0] === 0) return false;
    return arr.every((val, i, a) =>
        i < 2 || a[i] / a[i - 1] === a[1] / a[0]
    );
}




const Arreglo:number[] = [2, 4, 6, 8, 10];
console.log(Arreglo);
console.log(detectarOrden(Arreglo));

console.log(Arreglo);
console.log(esAritmetica(Arreglo));
console.log(esGeometrica(Arreglo));
