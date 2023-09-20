var nome = prompt("Digite o seu nome");
let xp = parseFloat(prompt("Qual seu xp?"));
let nivel = ['Ferro', 'Bronze', 'Prata', 'Ouro', 'Platina', 'Ascendente', 'Imortal', 'Radiante'];

if (xp < 1001) {
  alert("O herói de nome " + nome + " está no nível " + nivel[0]);
} else if (xp >= 1001 && xp <= 2000) {
  alert("O herói de nome " + nome + " está no nível " + nivel[1]);
} else if (xp > 2000 && xp <= 5000) {
  alert("O herói de nome " + nome + " está no nível " + nivel[2]);
} else if (xp > 5000 && xp <= 6000) {
  alert("O herói de nome " + nome + " está no nível " + nivel[3]);
} else if (xp > 6000 && xp <= 7000) {
  alert("O herói de nome " + nome + " está no nível " + nivel[4]);
} else if (xp > 7000 && xp <= 8000) {
  alert("O herói de nome " + nome + " está no nível " + nivel[5]);
} else if (xp > 8000 && xp <= 9000) {
  alert("O herói de nome " + nome + " está no nível " + nivel[6]);
} else {
  alert("O herói de nome " + nome + " está no nível " + nivel[7]);
}