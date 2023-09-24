class caracteristicasDoHeroi{
  constructor(nome,idade,tipo){
    this.nome=nome;
    this.idade=idade;
    this.tipo=tipo;
  }
  atacar(){
      let ataque ="";
       switch (this.tipo) {
        case "mago":
          ataque = "Magia";
          break;
        case "guerreiro":
          ataque = "Espada";
          break;
        case "monge":
          ataque = "Artes Marciais"; 
          break;
        case "ninja":
          ataque = "Shuriken"; 
          break;
        default:
          ataque = "não há um tipo e ataque definido";
  }
      console.log(`o ${this.tipo} atacou usando ${ataque}`);
    }
  }
  const primeiroHeroi= new caracteristicasDoHeroi("Vinicius","29","guerreiro");
  const segundoHeroi= new caracteristicasDoHeroi("Jacke","26","monge");
  const terceiroHeroi= new caracteristicasDoHeroi("Samuel","15");
  primeiroHeroi.atacar();
  segundoHeroi.atacar();
  terceiroHeroi.atacar();
