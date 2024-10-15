package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val student:Student? = Student()
    //let
    var studentUnit = student?.let{//работает с объектом через it, не возвращает сам объект
        it.hi()
        it.bye()
        it.name = "123"
    }
    //apply
    var student2 = student?.apply{//работает с соедржимым объекта, возвравщет объект
        hi()
        bye()
        name = "1234"
    }
    //run
    val stringStudent = Student().run{// рабоатет с содержимым объекта, возвращает последнее значение
        hi()
        bye()
        lastname
    }
    println(stringStudent)
    //with
    val nameStudent = with(Student()){// рабоатет с содержимым объекта, возвращает последнее значение
        bye()
        hi()
        123
    }
    println(nameStudent)

    val StudentCringe = Student().also{//работает с объектом через it, возвращает сам объект
        it.hi()//ir ot st
        it.bye()
        it.name = "Hello"
        Math.PI
    }
    println(StudentCringe.name)
}