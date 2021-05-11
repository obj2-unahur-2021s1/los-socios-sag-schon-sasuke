package ar.edu.unahur.obj2.socios

abstract class Barrio {
    abstract fun influirPropina(cliente: Cliente, propinaSegunAnimo : Int): Int
}

object LasRosas : Barrio() {
    override fun influirPropina(cliente: Cliente, propinaSegunAnimo : Int) = 50
}

object LasLauchas : Barrio() {
    override fun influirPropina(cliente: Cliente, propinaSegunAnimo : Int) = -propinaSegunAnimo / 2
}

object BarrioVerde : Barrio() {
    override fun influirPropina(cliente: Cliente, propinaSegunAnimo : Int) = 200
}

object LasTorres : Barrio() {
    override fun influirPropina(cliente: Cliente, propinaSegunAnimo : Int) = 0
}