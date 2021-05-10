package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec

class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    val resfriado = Resfriado()
    val enojada = Enojado_a()
    val lasLauchas = Las_Lauchas()
    val lasRosas = Las_Rosas()
    val pollo = Pedido(500)
    val comidaPerro = Pedido(300)
    val cliente = Cliente(resfriado,1000,lasLauchas)
    val clienta = Cliente(enojada,350,lasRosas)

    cliente.recibirPedido(pollo)
    cliente.darPropina().shoulbe(250)
    clienta.recibirPedido(comidaPerro)
    clienta.darPropina().shoulbe(0)
    clienta.bipolariadad(resfriado)
    clienta.darPropina().shoulbe(350)

  }
})
