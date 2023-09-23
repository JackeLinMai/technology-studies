function pontos(vitoria,derrota){
  return vitoria - derrota;
  }
  let pontosTotais= pontos(90,70);
  function nivel(){
      switch (true){
        case pontosTotais <=10:
        return "Noob";

        case pontosTotais >10 && pontosTotais<= 20:
        return "Bronze"

        case pontosTotais >20 && pontosTotais <=40:
          return "Prata";

        case pontosTotais >40 && pontosTotais <=50:
          return "Ouro";

        case pontosTotais >60 && pontosTotais <=70:
          return "Diamente";

        case pontosTotais> 70 && pontosTotais <=80:
          return "Lendario";

        case pontosTotais >80 && pontosTotais <=90:
          return "Imortal";
      }
  }
  let nivelFInal= nivel();
  console.log("O heroi tem um total de "+pontosTotais+" seu nivel é dado por "+nivelFInal)
