fun uniqueMemberSize(array: Array<Int>) = array.toSet().size

fun intersectionArray(arr1: Array<Int>, arr2: Array<Int>) = arr1.intersect(arr2.toSet())

fun unionArray(arr1: Array<Int>, arr2: Array<Int>) = arr1.union(arr2.toSet())

fun filter(arr1: Array<Int>) = arr1.filter { el -> el < arr1.average() }

fun secondMin(arr1: Array<Int>): Int? =
    when {
        arr1.isEmpty() -> null
        arr1.size == 1 -> arr1[0]
        else -> arr1.toMutableList().sorted()[1]
    }

fun secondMax(arr1: Array<Int>): Int? =
    when {
        arr1.isEmpty() -> null
        arr1.size == 1 -> arr1[0]
        else -> arr1.toMutableList().sorted()[arr1.size - 2]
    }

fun main() {
    println("unique element size: ${uniqueMemberSize(arrayOf(1,2,5,0,0,2,10,50))}")
    println("intersect: ${intersectionArray(arrayOf(1,2,3,4,5,6,7,8), arrayOf(2,5,6,11,60,25))}")
    println("union: ${unionArray(arrayOf(1,2,3,4,5,6,7,8), arrayOf(2,5,6,11,60,25))}")
    println("filter: ${filter(arrayOf(1,2,3,4,5,6,7,8))}")
    println("second max element: ${secondMax(arrayOf<Int>(1,2,6,0,-5,-66)) ?: "array is empty"}")
    println("second min element: ${secondMin(arrayOf<Int>(1,2,6,0,-5,-66)) ?: "array is empty"}")
}