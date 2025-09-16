
function detectarOrden(arr: number[]): string {
    const ascendente = arr.every((val, i, a) => i === 0 || a[i - 1] <= val);
    const descendente = arr.every((val, i, a) => i === 0 || a[i - 1] >= val);

    if (ascendente) return "Ascendente";
    else if (descendente) return "Descendente";
    else return "Desordenado";
}





const Arreglo:number[] = [2, 4, 6, 8, 10];
console.log(Arreglo);
console.log(detectarOrden(Arreglo));
