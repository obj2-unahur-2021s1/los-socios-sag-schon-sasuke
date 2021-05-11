package ar.edu.unahur.obj2.socios

abstract class EstadoDeAnimo {
    abstract fun influirPropina(cliente: Cliente,importe : Int): Int
}

object Enojadx : EstadoDeAnimo() {
    override fun influirPropina(cliente: Cliente,importe : Int) = 0
}

object Feliz : EstadoDeAnimo() {
    override fun influirPropina(cliente: Cliente,importe : Int) = (importe * 0.25).toInt()
}

object Indiferente : EstadoDeAnimo() {
    override fun influirPropina(cliente: Cliente,importe : Int) = cliente.dineroEnBolsillo
}

object Resfriadx : EstadoDeAnimo() {
    override fun influirPropina(cliente: Cliente,importe : Int) = importe
}