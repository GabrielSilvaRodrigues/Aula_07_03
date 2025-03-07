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

