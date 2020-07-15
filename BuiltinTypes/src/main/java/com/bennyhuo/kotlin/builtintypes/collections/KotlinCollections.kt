package com.bennyhuo.kotlin.builtintypes.collections


fun main() {
    repeat(5){ i ->
        println("loop${i+1}")
    }
    val names = arrayOf("abreslav","udalov", "yole")

    for(i in names.indices )
    {
        println(i)
    }
    for(name in names )
    {
        println(name)
    }
    for((i,name) in names.withIndex() )
    {
        println("$i---$name")
    }
    names.forEach { println("$it") }
    names.forEach { name ->
        println(name)
    }


//    val intList: List<Int> = listOf(1, 2, 3, 4)
//    val intList2: MutableList<Int> = mutableListOf(1, 2, 3, 4)
//
//    val map: Map<String, Any> =
//        mapOf("name" to "benny", "age" to 20)
//
//    map.toMutableMap()
//    val map2: Map<String, Any> =
//        mutableMapOf("name" to "benny", "age" to 20)
//
//    val stringList = ArrayList<String>()
//
//    for (i in 0 .. 10){
//        stringList.add("num: $i")
//    }
//
//    for (i in 0 .. 10){
//        stringList += "num: $i"
//    }
//
//    for (i in 0 .. 10){
//        stringList -= "num: $i"
//    }
//
//    stringList[5] = "HelloWorld"
//    val valueAt5 = stringList[5]
//
//    val hashMap = HashMap<String, Int>()
//    hashMap["Hello"] = 10
//    println(hashMap["Hello"])
//
////    val pair = "Hello" to "Kotlin"
////    val pair = Pair("Hello", "Kotlin")
////
////    val first = pair.first
////    val second = pair.second
////    val (x, y) = pair
//
//    val triple = Triple("x", 2, 3.0)
//    val first = triple.first
//    val second = triple.second
//    val third = triple.third
//    val (x, y, z) = triple

}
