package com.plataformas.lab2


fun main(){
    val valores = listOf(80,52,74,78,98,41,67)
    val promedio = calcularPromedio(valores)
    println("El valor promedio de lista es: $promedio")
    val valoresImpares = valores.filter{it % 2 != 0}
    println("Los valores impares de la lista son: $valoresImpares")
    val palabraPali = "oso"
    val esPalindromo = isPalindrome(palabraPali)
    println("Es $palabraPali palindromo?: $esPalindromo")
    val nombres = listOf("Ana", "Juan", "Pedro", "Maria", "Carlos")
    val nombresSaludo = nombres.map { "¡Hola, $it!" }
    println("Nombres con saludo: $nombresSaludo")
    val result = performOperation(5,2, { a : Int, b : Int -> a * b })
    println("Resultado de la operación: $result")
    val personas = listOf(
        Person("Ana", 25, "Femenino"),
        Person("Juan", 30, "Masculino"),
        Person("Pedro", 28, "Masculino"),
    )
    val estudiantes = personas.mapIndexed() { index, person -> mapPersonToStudent(person ,"${index + 1}") }
    estudiantes.forEach { estudiante ->
        println("El Estudiante ${estudiante.name} tiene ${estudiante.age}")
    }


}

fun calcularPromedio(valores: List<Int>) : Int{
    return valores.reduce{acc, valor -> acc + valor} / valores.size
}

fun isPalindrome(palabra: String): Boolean {
    val palabraInvertida = palabra.reversed()
    return palabra == palabraInvertida
}

fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int{
    val resultado = operation(a, b)
    return resultado
}

fun mapPersonToStudent(person: Person, studentId: String): Student {
    return Student(
        name = person.name,
        age = person.age,
        gender = person.gender,
        studentId = studentId
    )
}