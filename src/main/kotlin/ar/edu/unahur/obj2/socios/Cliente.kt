package ar.edu.unahur.obj2.socios

class Cliente (var estadoDeAnimo : EstadoDeAnimo, var dineroEnBolsillo : Int, var barrio : Barrio) {
    fun cuantaPropinaDejaria(importe : Int): Int {
        val segunEstado = estadoDeAnimo.influirPropina(this,importe)
        return segunEstado + barrio.influirPropina(this, segunEstado)
    }
}