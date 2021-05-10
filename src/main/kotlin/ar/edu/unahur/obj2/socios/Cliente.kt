package ar.edu.unahur.obj2.socios

class Cliente(var estado_De_Animo : Estado_De_Animo, var plata: Int, var zona : Zona){
    val pedidos = mutableListOf<Pedido>()
    var propina : Int = 0

    fun agregarPedido(pedido: Pedido){
        this.pedidos.add(pedido)
    }

    fun comerPedido(pedido: Pedido){
        this.pedidos.remove(pedido)
    }

    fun recibirPedido(pedido: Pedido){
        this.agregarPedido(pedido)
    }

    fun bipolaridad(animo: Estado_De_Animo){
        this.estado_De_Animo = animo
    }

    fun darPropina() : Int {
        propina += this.estado_De_Animo.influirPropina(this)
        return  propina + this.zona.influirPropina(this)
    }
}
