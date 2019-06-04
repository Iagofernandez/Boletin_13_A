class Xogador(nome:String,apelidos:String, id:Int, idade:Int, var dorsal:Int, var demarcacion:String ):Seleccion(nome,apelidos,id,idade) {
    private fun xogar(){}
    private fun entrenar(){}
    override fun viaxar() {
        System.out.println("Viaxan os xogadores:"+super.nome!!)
    }

}