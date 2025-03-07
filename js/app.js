//Criando um Array/Vetor com valores

//Usando Colchetes
let modelos = ['Gol', 'Corsa', 'Fusca', 12, true, false, null]
//ou
//Usando o construtor da Classe Array
let marcas = Array ('Chevrolet', 'Ford', 'Fiat')


//Criar um Array/Vetor sem valores (ou vazia)
let cores = [];
//ou
let categoria = new Array();

// exibir o conteúdo
console.log(modelos)
console.log(marcas)
console.log(cores)
console.log(categoria)

// Ele permiti limitar ao utilizar essa sintaxe
let clientes = new Array(5)

console.log(clientes)

//adicionando um elemento após a criação de um vetor/array ilimitada

//adicionando no fim do vetor
marcas.push('Jeep')

//adicionando no inicio do vetor
marcas.unshift('VW')
console.log(marcas)

//removendo o ultimo elemento 
marcas.pop()
console.log(marcas)

//removendo o primeiro elemento 
marcas.shift()
console.log(marcas)

// selecionado e copiando uma parte do vetor
let frutas = ['Laranja','Melância', 'Kiwi', 'Uva', 'Manga']
let legumes = ['Batata', 'Cenoura', 'Milho']

let feira = frutas.concat(legumes)

console.log(feira)

let frutas_sel = frutas.slice(1,4)

console.log(frutas_sel)

let frutas_c = frutas.splice(1,1,"Manga")
console.log(frutas_c)

let situacao = frutas.includes("Manga")
console.log(situacao)

situacao = frutas.includes("Caju")
console.log(situacao)

let texto = frutas.join(",")
let texto1 = frutas.join(", ")
let texto2 = frutas.join("\n ")
let texto3 = frutas.join(" - ")

console.log(texto)
console.log(texto1)
console.log(texto2)
console.log(texto3)

let numeros = [0,1,2,3,4,5,6,7,8,9,10]
let tabuada = numeros.map(x=> x*2)
//console.log(tabuada)
//filter
let pares = numeros.filter(x=> {if (x == 0){}else{ return x%2==0 }})

//console.log(pares)
// let mult=3
// let tabuada_dinamica = numeros.map(x=> {let i=1; while(i<=mult){
//     x=x*i;
//     i++;
//     return x;
// }})
// console.log(tabuada_dinamica)
let loc = numeros.find(x=> x>5)
console.log(loc)
loc = numeros.findIndex(x=> x>2)
console.log(loc)

let return_some = numeros.some(x=> x>5)
console.log(return_some)

let return_every = numeros.every(x=>x>=0)
console.log(return_every)