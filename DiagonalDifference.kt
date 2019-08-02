import kotlin.math.absoluteValue

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var one = IntArray(arr.size)
    var two = IntArray(arr.size)
    for (i in 0 until arr.size){
        one.set(i, arr[i][i])
        var j = arr.size-i -1
        two.set(i, arr[i][j])

    }
    return (one.sum() - two.sum()).absoluteValue
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }
    val result = diagonalDifference(arr)

    println(result)
}
