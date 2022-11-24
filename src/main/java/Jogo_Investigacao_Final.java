import java.util.Scanner;
import java.util.Random;
/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caio Santos
 */
public class Jogo_Investigacao_Final {
    
    static Scanner entrada = new Scanner(System.in);
    static int vida;

    // O usúario irá inserir as informações (Entrada de Dados)
    static int entradaDeDados() {

        int n; // declarando n como variável local
        System.out.println("Opção: ");
        n = entrada.nextInt();
        return n;
    }

    // Menu = mostra as opções de escolha - Tela inicial
    static void menu() {

        System.out.println(
                "                          **--BEM - VINDO--**\n  Jogo de investigação dos casos de desaparecimento da cidade de Garanhões ☠ ✞\n ");
        System.out.println("➥ Menu ");
        System.out.println("1 - Instruções");
        System.out.println("2- Jogar");
        System.out.println("3- Créditos");
        System.out.println("4- Sair \n");
        System.out.println("➥ Escolha uma opção: ");
    }

    // irá informar as regras do jogo
    static void instrucoes() {
        System.out.println("\n ➥ Instruções ");
        System.out.println(
                "\n Um Investigador de uma das linhagens mais antigas de detetives paranormais, viaja até a cidade de Garanhões no Pernambuco,\n em uma das épocas mais festivas do estado, o famoso São João, para solucionar o desaparecimento de mulheres,\n o que mais intrigava o Investigador era a lua, tão vermelha e imersa no céu, como uma grande poça de sangue,\n era um dos cenários perfeitos para rituais satânicos, além disso a cada lua, duas jovens sumiam.\n E que parecia ser um crime normal, tornou-se uma das sagas mais difíceis de sua vida\n");
    }

    // jogo em si
    static void Jogo() {
        int dificuldade;

        String resposta;
        System.out.println("\n ➥ Jogar ");
        System.out.println("\n • Este jogo, existe dois modos de dificuldade: \n NORMAL com 10 vidas e o DIFICIL com 3 vidas. \n");
        System.out.println(" Qual a dificuldade que você quer jogar? \n 1 - Normal\n 2 - Dificil\n");
        dificuldade = entrada.nextInt();
        
        //dificuldade jogo
        switch (dificuldade){
            case 1:
                vida = 10;
                break;
            case 2:
                vida = 3;
                break;
        }
        

        String perguntas_noite[][] = {
            {"1 - Há um leve movimento de pessoas no local que são montadores das estruturas\n para a festa Junina que acontece toda noite neste período. Por onde você irá começar \na investigação? \n", // 0

                "Ir até uma pousada para se hospedar. (Você realiza o check-in e retorna à praça para obter mais informações)", // 1
                "Dormir no carro.( Voê não consegue dormir devido ao barulho e volta pra a praça.).", // 2
                "Ir até uma barraquinha de comida", // 3
                "Ascender um cigarro e observar melhor o local.", // 4
                "Ir até uma barraquinha de comida"}, // 5

            {"\n2 - Você se aproxima da vendedora e pergunta o porquê a festa esta um pouco vazia.\n Ela responde que é devido aos desaparecimentos que veem ocorrendo na cidade\n e o ultimo ocorreu na Capela Quilombola Timbó Nossa Senhor de Nazaré.\n Você come um milho e parte para a ação. Qual seu proximo passo?",
                "Compra outro milho.", // 1
                "Ir até a Capela Quilombola Timbó Nossa Senhor de Nazaré", // 2
                "Não liga para o que mulher falou e vai curtir a festa. ", // 3
                "Comprar um quentão na barra ao lado", // 4
                "Ir até a Capela Quilombola Timbó Nossa Senhor de Nazaré"}, // 5

            {"\n3 - Ao Chegar a Capela Quilombola, ele procura pelo Capelão(Padre que cuida da capela), para obter mais informações sobre\no desaparecimento, ao encontralo você  questiona sobre os desaparecimentos que vem acontecendo na cidade.O que você pergunta para o padre ?\n",
                "Como eu posso me Confessar ?",//1
                "Padre, ao longo dos anos, já ocorreu alguma coisa estranha deste nivel na cidade ? Você suspeita de quem possa estar cometendo esses desaparecimentos ?",//2
                "Qual é o horario da missa ? ", //3
                "Preciso batizar o meu filho, o que preciso fazer ? ",//4
                "Padre, ao longo dos anos, já ocorreu alguma coisa estranha deste nivel na cidade ? Você suspeita de quem possa estar cometendo esses desaparecimentos ?"},//5
            
            {"\n4 - Resposta do Padre >> Meu filho agora que você perguntou o único caso estranho que aconteceu por aqui, \nfoi o aparecimento de animais mortos sacrificados lá no cristo do Magano. Após o capelão ter lhe dito essas informações,voce?\n",
                "Pergunta se a igreja faz algum trabalho voluntario que ele possa contribuir",//1
                "Resolve aguardar o horario da missa para fazer as suas orações ",//2
                "Muito cansado da investigação, resolve voltar a praça para procurar um lugar para descansar",//3
                "Entra no carro e vai até o  Cristo do Magano", //4
                "Entra no carro e vai até o  Cristo do Magano"},//5
            
            {"\n5 - Ao chegar ao Cristo do Magano, ele se depara com um odor muito forte de carne estragada e varios urubus \nvooando baixo pela redondeza. De repente você encontra um cabrito morto, cortado a cabeça com uma marca satanica com formato de um Pentágono. Qual será a sua atitude ?\n",
                "Você tira um selfie e posta nas redes sociais",//1
                "Você vê a cena do cabrito morto e sai correndo",//2
                "Intrigado com a situação, voce começa a analisar a cena, em busca de pistas para descobrir o que está acontecendo.",//3
                "Angustiado com a cena, resolve ligar para o padre, pedindo ajuda ", //4
                "Intrigado com a situação, voce começa a analisar a cena, em busca de pistas para descobrir o que está acontecendo."},//5
            
            {"\n6 - Ao analisar a cena, você encontra no chão um amoleto indigina antigo, popular da tribo Cairu, bem conhecida na cidade\nlocaliza no sul da cidade. O que voce faria ?\n ",
                "Você quebra o amoleto ",
                "Voce pega o amoleto e vai em direção ao carro para a  tribo Cairu, achar a origem dele",
                "Você joga o amoleto no fogo", "Você leva o amoleto para casa para vender mais tarde ",
                "Voce pega o amoleto e vai em direção ao carro para a  tribo Cairu, achar a origem dele"},
            
            {"\n7 - Ao chegar lá voce procura o Pajé da Tribuo para que ele te ajude a esclarecer alguma duvidas sobre o sacrificio que voce encontrou no Cristo.\n\"Bom Pajé, encontrei um cabrito cortado a cabeça com um simbolo satanico lá no Cristo do Magano e encontrei um amoleto indigina na cena do sacrificio, voce conhece esse amuleto ?\n",
                "Não conheço",
                "Conheço , mas não vou falar ",
                "Explica que é uma reliquia sagrada do povo indigina, onde é ultilizado pelas bruxas para ritual satanico com o objetivo de ter a imortalidade\ne que esse ritual irá acontecer hoje no ponto mais alto da pedra encantada. Fala que a unica forma de matar a bruxa é ateando-a no fogo",
                "Sim, é meu", 
                "Explica que é uma reliquia sagrada do povo indigina, onde é ultilizado pelas bruxas para ritual satanico com o objetivo de ter a imortalidade\ne que esse ritual irá acontecer hoje no ponto mais alto da pedra encantada. Fala que a unica forma de matar a bruxa é ateando-a no fogo"},
            
            {"\n8 - Sem pensar muito no que fazer , você sai em direção a Pedra do reino encantado, para salvar as vitimas e acabar de vez com o reinado de crueldade das bruxas.\nAo chegar lá, voce se depara com as vitimas prostadas em frente ao altar da feiticeira. Como voce imobilizaria a bruxa ?\n",
                "Voce atiraria nela com uma bala de prata.",
                "Voce daria um mata leão na bruxa ? ",
                "Voce corre em direção a bruxa , para tentar golpealá",
                "Voce atiraria nela com um dardo tranquilizante que faria ela dormi.",
                "Voce atiraria nela com um dardo tranquilizante que faria ela dormi."},
            
            {"\n9 -  Ao acerta o tiro na bruxa, ela cai imobilizada  no chão, dando chance para que você possa desamarrar as vitimas e fazer uma fogueira para queimalá. Antes que ela acorde, voce ?",
                "Voce espera ela acorda e tenta convence-la de não matar as vitimas.",
                "Voce arrasta ela ate o fogo.", 
                "Voce desiste de queimala e sai correndo com as vitimas.",
                "Você corta a cabeça dela", 
                "Voce arrasta ela ate o fogo."}};

        int list_numeros[] = new int[5];
        list_numeros = lista_numeros_aleatorios(5);

        // Loop que percorre a matriz da noite
        int controle_do_while = 0;
        while (controle_do_while < perguntas_noite.length) {
            System.out.println(perguntas_noite[controle_do_while][0]
                    + "\nA - " + perguntas_noite[controle_do_while][list_numeros[1]]
                    + "\nB - " + perguntas_noite[controle_do_while][list_numeros[2]]
                    + "\nC - " + perguntas_noite[controle_do_while][list_numeros[3]]
                    + "\nD - " + perguntas_noite[controle_do_while][list_numeros[4]]);

            System.out.println("\n Informe a alternativa correta: ");
            resposta = entrada.next().toUpperCase();

            // Verificar se a alternativa é valida!
            if (!"A".equals(resposta) && !"B".equals(resposta) && !"C".equals(resposta) && !"D".equals(resposta) && !"Z".equals(resposta)) {
                System.out.println("\n\nAlternativa invalida!\n\n");
                continue;
            } else if ("Z".equals(resposta)) {
                return;
            }

            //Varificar resposta do jogador!
            verificar_resposta(resposta, perguntas_noite[controle_do_while][list_numeros[1]], perguntas_noite[controle_do_while][list_numeros[2]], perguntas_noite[controle_do_while][list_numeros[3]], perguntas_noite[controle_do_while][list_numeros[4]], perguntas_noite[controle_do_while][5]);

            // Verificar a vida e os pontos do jogador!
            if (vida <= 0) {
                System.err.println("\n\nSinto muito você perdeu! SORRY\n\n");
                return;
            }

            //Ir para proxima pergunta
            controle_do_while++;
        }
        System.out.println("\n\nVocê ganhou, parabens!!!\n\n");
    }

    // **BUBBLE SORT** Random - gerar numeros aleatorios para o embaralhamento
    static int[] lista_numeros_aleatorios(int tamanho) {
        int lista_numeros[] = new int[tamanho];
        Random r = new Random();
        int numero_aleatorio, controle;

        for (int i = 0; i < tamanho; i++) {
            numero_aleatorio = r.nextInt(tamanho) + 1;
            controle = 0;
            while (controle < i) {
                if (lista_numeros[controle] == numero_aleatorio || numero_aleatorio == 5) {
                    numero_aleatorio = r.nextInt(tamanho);
                    controle = 0;
                } else {
                    controle++;
                }
                lista_numeros[i] = numero_aleatorio;
            }
        }
        return lista_numeros;
    }

    // VERIFICACAO DE RESPOSTA
    static void verificar_resposta(String resposta, String a, String b, String c, String d, String r) {
        switch (resposta) {
            case "A":
                if (a.equals(r)) {
                    System.out.println("\n\n*****************");
                    System.out.println("Você acertou!");
                    System.out.println("******************\n\n");                   
                } else {
                    vida--;
                    System.out.println("\n\nVocê errou!");
                    System.out.println("Você tem " + vida + " vidas");
                    
                }
                break;
            case "B":
                if (b.equals(r)) {
                    System.out.println("\n\n*****************");
                    System.out.println("Você acertou!");
                    System.out.println("******************\n\n");
                } else {
                    vida--;
                    System.out.println("\n\nVocê errou!");
                    System.out.println("Você tem " + vida + " vidas");
                   
                }
                break;
            case "C":
                if (c.equals(r)) {
                    System.out.println("\n\n*****************");
                    System.out.println("Você acertou!");
                    System.out.println("******************\n\n");
                } else {
                    vida--;
                    System.out.println("\n\nVocê errou!");
                    System.out.println("Você tem " + vida + " vidas");
                  
                }
                break;
            case "D":
                if (d.equals(r)) {
                    System.out.println("\n\n*****************");
                    System.out.println("Você acertou!");
                    System.out.println("******************\n\n");
                } else {
                     vida--;
                    System.out.println("\n\nVocê errou!");
                    System.out.println("Você tem " + vida + " vidas");
                   
                }
                break;
        }
    }

    // creditos
    static void creditos() {

        System.out.println("\n ➥ Créditos ");
        System.out.println(
                " Este jogo foi desenvolvido pelo aluno CAIO, cursante do curso de ADS do Centro Universitário Senac\n");
        System.out.println("• Caio Vinicius de A. Santos > ID : 1142214088 ");
        
    }
    // z volta 
    // opção sair
    static void sair() {
        System.out.println("\n ➥ Sair ");
        System.out.println("\n  ✞ THE END GAME  ✞");
        System.out.println(" Agradecemos por jogar o nosso GAME \n");
    }

    // Opções de escolha inicial para o jogador
    static void iniciarPrograma(int op1) {

        switch (op1) {
            case 1:
                instrucoes();
                break;
            case 2:
                Jogo();
                break;
            case 3:
                creditos();
                break;                
            default:
                System.out.println(" Valor entrada é incorreto"); // Para quando o usuario informar uma opção não
        }
    }

    // Menu principal
    public static void main(String[] args) {
        int op;
        do {
            menu();
            op = entradaDeDados(); 
            if (op != 4) {
                iniciarPrograma(op);
            }else{
                sair();
                break;
            }          
            if (op > 4 || op < 1) {
                System.err.println("\nOpção inválida.");
            }          
        } while (op > 0 || op < 4);             
    }
        

}
    

