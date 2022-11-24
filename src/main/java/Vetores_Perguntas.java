
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caio Santos
 */
public class Vetores_Perguntas {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String resposta;
        
        int PV = 10;
        
        String [][] perguntasManha = new String [12][6];
        
        //Pergunta 1
        perguntasManha[0][0] = " Há um leve movimento de pessoas no local que são montadores das estruturas para a festa Junina que acontece toda noite neste período.\n Por onde você irá começar a investigação?";
        perguntasManha[0][1] = " Conversar com um dos montadores no local.";
        perguntasManha[0][2] = " Ascender um cigarro e observar melhor o local.";
        perguntasManha[0][3] = " Ir a banca de jornal para comprar um mapa da cidade.";
        perguntasManha[0][4] = " Ir até uma pousada para se hospedar.";
        perguntasManha[0][5] = " Conversar com um dos montadores no local.";
        
        //Pergunta 2
        perguntasManha[1][0] = " Você se aproxima de um montador e diz: Olá! Sou novo na cidade.\n Fiquei sabendo sobre alguns desaparecimentos na região e queria saber se é um local seguro para se visitar.\n O montador responde: Seja bem vindo!\n Aqui é um bom local para se passar as festividade de São João... ou era o que eu poderia dizer se não fossem os ultimos desaparecimentos na região.\n Qual sua ação?";
        perguntasManha[1][1] = " Você demonstra surpresa e pergunta: Quem desapareceu e onde?";
        perguntasManha[1][2] = " Você responde: Mortes acontecem em todo lugar.";
        perguntasManha[1][3] = " Você não presta muita atenção no que ele diz e pede para repetir. ";
        perguntasManha[1][4] = " Debocha do montador dizendo: \"Acho que não é nada para se preocupar.";
        perguntasManha[1][5] = " Você demonstra surpresa e pergunta: Quem desapareceu e onde?";
        
        //Pergunta 3
        perguntasManha[2][0] = " O montador diz : É inexplicavel o que ocorreu, a ultima a desaparecer foi a Eva a filha do seu José, ela era uma jovem muito doce e foi um choque muito grande para todos os moradores da cidade.\n Ela desapareceu aqui na praça do Menino que Chora.\n Tem um buchico que foi igual ao desaparecimento na Capela Quilombola Timbó Nossa Senhor de Nazaré que fica ao norte da cidade.\n Após o montador ter lhe dito essas informações, voce ... ?";
        perguntasManha[2][1] = " Observa ao redor, procurando mais informações que possa ajudar na investigação, porém não encontra nada.";
        perguntasManha[2][2] = " Continua conversando com o montador sobre outro assunto.";
        perguntasManha[2][3] = " Entra no carro e vai até a Capela Quilombola.";
        perguntasManha[2][4] = " Ignora as informações que o montador lhe falou.";
        perguntasManha[2][5] = " Entra no carro e vai até a Capela Quilombola.";
          
        //Pergunta 4
        perguntasManha[3][0] = " Ao Chegar a Capela Quilombola, ele procura pelo Capelão(Padre que cuida da capela),\n para obter mais informações sobre o desaparecimento, ao encontralo você  questiona sobre os desaparecimentos que vem acontecendo na cidade.\n O que você pergunta para o padre ?";
        perguntasManha[3][1] = " Como eu posso me Confessar?";
        perguntasManha[3][2] = " Padre, ao longo dos anos, já ocorreu alguma coisa estranha deste nível na cidade?\n Você suspeita de quem possa estar cometendo esses desaparecimentos?";
        perguntasManha[3][3] = " Qual é o horario da missa? ";
        perguntasManha[3][4] = " Preciso batizar o meu filho, o que preciso fazer? ";
        perguntasManha[3][5] = " Padre, ao longo dos anos, já ocorreu alguma coisa estranha deste nível na cidade?\n Você suspeita de quem possa estar cometendo esses desaparecimentos?";
        
        //Pergunta 5
        perguntasManha[4][0] = " Prade responde: Meu filho agora que você perguntou o único caso estranho que aconteceu por aqui, foi o aparecimento de animais mortos sacrificados lá no cristo do Magano.\n Após o capelão ter lhe dito essas informações,voce ...";
        perguntasManha[4][1] = " Pergunta se a igreja faz algum trabalho voluntario que ele possa contribuir.";
        perguntasManha[4][2] = " Resolve aguardar o horario da missa para fazer as suas orações.";
        perguntasManha[4][3] = " Muito cansado da investigação, resolve voltar a praça para procurar um lugar para descansar.";
        perguntasManha[4][4] = " Entra no carro e vai até o  Cristo do Magano.";
        perguntasManha[4][5] = " Entra no carro e vai até o  Cristo do Magano.";
        
        //Pergunta 6
        perguntasManha[5][0] = " Ao chegar ao Cristo do Magano, ele se depara com um odor muito forte de carne estragada e varios urubus vooando baixo pela redondeza.\n De repente você encontra um cabrito morto, cortado a cabeça com uma marca satanica com formato de um Pentágono.\n Qual será a sua atitude?";
        perguntasManha[5][1] = " Você tira um selfie e posta nas redes sociais.";
        perguntasManha[5][2] = " Você vê a cena do cabrito morto e sai correndo.";
        perguntasManha[5][3] = " Intrigado com a situação, voce começa a analisar a cena, em busca de pistas para descobrir o que está acontecendo.";
        perguntasManha[5][4] = " Angustiado com a cena, resolve ligar para o padre, pedindo ajuda.";
        perguntasManha[5][5] = " Intrigado com a situação, voce começa a analisar a cena, em busca de pistas para descobrir o que está acontecendo.";
        
        //Pergunta 7
        perguntasManha[6][0] = " Ao analisar a cena, você encontra no chão um amoleto indigina antigo, popular da tribo Cairu, bem conhecida, localiza no sul da cidade.\n Com isso você entra no carro e vai em direção a tribo.";
        perguntasManha[6][1] = "";
        perguntasManha[6][2] = "";
        perguntasManha[6][3] = "";
        perguntasManha[6][4] = "";
        perguntasManha[6][5] = "";
        
        //Pergunta 8
        perguntasManha[7][0] = " Ao chegar lá voce procura o Pajé da Tribuo para que ele te ajude a esclarecer algumas duvidas\n sobre o sacrificio que voce encontrou no Cristo.\n  -\"Bom Pajé, encontrei um cabrito cortado a cabeça com um simbolo satanico\n lá no Cristo do Magano e encontrei um amoleto indigina na cena do sacrificio, voce conhece esse amuleto?";
        perguntasManha[7][1] = "";
        perguntasManha[7][2] = "";
        perguntasManha[7][3] = "";
        perguntasManha[7][4] = "";
        perguntasManha[7][5] = "";
        
        //Pergunta 9
        perguntasManha[8][0] = " Pajé - \" Esse amoleto é uma reliquia sagrada do povo indigena que a muitos anos vem sendo utilizado pelas Bruxas , para promover um ritual satanico que propociona a imortalidade.\n Esse ritual só e possivel ser realizado na ultima luas de sangue, que ocorrem a cada século. Para alcançar o poder maximo da lua,\n as bruxas precisam ir ate ao ponto mais alto da cidade que fica na PEDRA DO REINO ENCANTADO e realizar o sacrificio das meninas desaparecidas, que será hoje a noite.\n A unica forma de matar uma Bruxa e ateando-a no fogo!!";
        perguntasManha[8][1] = "";
        perguntasManha[8][2] = "";
        perguntasManha[8][3] = "";
        perguntasManha[8][4] = "";
        perguntasManha[8][5] = "";
        
        //Pergunta 10
        perguntasManha[9][0] = " Sem pensar muito no que fazer , você sai em direção a Pedra do reino encantado,\n para salvar as vitimas e acabar de vez com o reinado de crueldade das bruxas.\n Ao chegar lá, voce se depara com as vitimas prostadas em frente ao altar da feiticeira.\n Como voce imobilizaria a bruxa??";
        perguntasManha[9][1] = " Voce atiraria nela com uma bala de prata.";
        perguntasManha[9][2] = " Voce daria um mata leão na bruxa?";
        perguntasManha[9][3] = " Voce corre em direção a bruxa , para tentar golpealá.";
        perguntasManha[9][4] = " Voce atiraria nela com um dardo tranquilizante que faria ela dormi.";
        perguntasManha[9][5] = " Voce atiraria nela com um dardo tranquilizante que faria ela dormi.";
        
        //Pergunta 11
        perguntasManha[10][0] = "  Ao acerta o tiro na bruxa, ela cai imobilizada no chão,\n dando chance para que você possa desamarrar as vitimas e fazer uma fogueira para queimalá.\n Antes que ela acorde, voce ...";
        perguntasManha[10][1] = " Voce espera ela acorda e tenta convence-la de não matar as vitimas.";
        perguntasManha[10][2] = " Voce arrasta ela ate o fogo.";
        perguntasManha[10][3] = " Voce desiste de queimala e sai correndo com as vitimas.";
        perguntasManha[10][4] = " Você corta a cabeça dela";
        perguntasManha[10][5] = " Voce arrasta ela ate o fogo.";
        
        //Pergunta 12
        perguntasManha[11][0] = " Parabéns voce realmente é um otimo investigador. Salvou as vitimas e a cidade da maldade daquela bruxa cruel.";
        perguntasManha[11][1] = "";
        perguntasManha[11][2] = "";
        perguntasManha[11][3] = "";
        perguntasManha[11][4] = "";
        perguntasManha[11][5] = "";
        
        
        for(int i = 0; i < perguntasManha.length; i++){
		           System.out.println(perguntasManha[i][0] + "\nA - " + perguntasManha [i][1] + "\nB - "+ perguntasManha [i][2] + "\nC - " + perguntasManha [i][3] + "\nD - "+ perguntasManha[i][4]);
            
                           System.out.println("\n Informe a alternativa correta: ");
                           resposta = entrada.next();
                           
                           if(resposta == perguntasManha[i][5]){
                               System.out.println("Resposta correta");
                           }else{
                               PV --;
                               System.out.println("Resposta errada! Você perde 1 PV.\n Seu PV é de: " + PV);
                               
                           }
    }
    
        
}
    
}
