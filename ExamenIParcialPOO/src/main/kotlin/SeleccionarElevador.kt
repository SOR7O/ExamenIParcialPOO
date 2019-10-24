import kotlin.concurrent.thread

enum class  ESTADO{}
open class SeleccionarElevador(var Piso: Int) {
    open class Elevador(val Piso:Int)
    {
        override fun toString():String{
            return "Piso:$Piso "
        }
    }



    open fun ElevadorSeleccionado() {
        val numero: Int?
        println("Estado de Elevador,DETENIDO:Piso:$Piso")
        print("Ingrese el piso al que desea: ")
        numero = readLine()!!.toInt()
        if(numero<16 && numero>0){
        if(numero<Piso){
            while (Piso!=numero){
                println("Estado de Elevador,ABAJO:Piso:$Piso")
                println("El elevador a llegado al piso indicado")
                Thread.sleep(1000)
                Piso--
            }
        }
        if(numero>Piso){
    while (Piso!=numero){
        println("Estado de Elevador,ARRIBA:Piso:$Piso")
        Thread.sleep(1000)
        Piso++
    }}}
        else{
            println("Pisos no disponibles")
        }


    }
}