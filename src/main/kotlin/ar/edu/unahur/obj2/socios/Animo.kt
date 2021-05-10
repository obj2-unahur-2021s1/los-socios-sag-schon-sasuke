package ar.edu.unahur.obj2.socios

abstract class Estado_De_Animo(){

    abstract fun influirPropina(cliente: Cliente) : Int

}


class Resfriado_a() : Estado_De_Animo(){

    override fun influirPropina(cliente: Cliente) = cliente.pedidos.sumBy { it.precio }

}

class Enojado_a() : Estado_De_Animo(){

    override fun influirPropina(cliente: Cliente) = 0
}

class Feliz() : Estado_De_Animo(){

    override fun influirPropina(cliente: Cliente) = (cliente.pedidos.sumBy { it.precio } * 25) / 100
}

class Indiferente() : Estado_De_Animo(){

    override fun influirPropina(cliente: Cliente) = cliente.plata

}