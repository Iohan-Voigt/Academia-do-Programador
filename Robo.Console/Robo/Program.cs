using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// Tupiniquim_I v1.0

#region inputs [OK]

#endregion
#region criação da matriz [OK]
// fazer uma matriz com índices customizaveis
#endregion
#region Movimentação [Em progresso]
#region Comandos de movimento [OK]
#endregion
#region posicionamento[OK]
#endregion
#region Print da posição final[OK]
#endregion
#endregion

namespace Robo
{
    class Program
    {
        static void Main(string[] args)
        {

            // declaração das variáveis
            string[]       entrada;
            int posicaoX, posicaoY;
            String         comando;
            char       var,direcao;
            byte repetidor = 0;

            entrada = Console.ReadLine().Split(' ');
            int[,] matriz = new int[(Convert.ToInt32(entrada[0]) - 1),
                                     (Convert.ToInt32(entrada[1]) - 1)];
            while (repetidor < 2)
            {
                // imputs              S
                entrada = Console.ReadLine().Split(' ');
                posicaoX = Convert.ToInt32(entrada[0]);
                posicaoY = Convert.ToInt32(entrada[1]);
                direcao = Convert.ToChar(entrada[2]);


                // entrada de movimentos
                comando = Console.ReadLine();

                // soletrador de strings (divide a string lepra por letra e salva njuma variável temporária "var")

                for (int i = 0; i < comando.Length; i++)
                {
                    var = comando[i];
                    ////Console.WriteLine(var);

                    switch (var)
                    {
                        case 'E':
                            direcao = ViraEsquerda(direcao);
                            break;

                        case 'D':
                            direcao = ViraDireita(direcao);
                            break;

                        case 'M':
                            // aplica a rotação ao robo
                            switch (direcao)
                            {
                                case 'N':
                                    posicaoY = AndarNorte(posicaoY);
                                    break;
                                case 'L':
                                    posicaoX = AndarLeste(posicaoX);
                                    break;
                                case 'S':
                                    posicaoY = AndarSul(posicaoY);
                                    break;
                                case 'O':
                                    posicaoX = AndarOeste(posicaoX);
                                    break;
                            }
                            break;
                    }
                }

                Console.WriteLine($"{posicaoX} {posicaoY} {direcao}");
                repetidor++;
            }
            Console.ReadLine();
        }

        #region Movimentos
        // movimentação
        static int AndarNorte(int posY)    {return ++posY;}

        static int AndarSul  (int posY)    {return --posY;}

        static int AndarLeste(int posX)    {return ++posX;}

        static int AndarOeste(int posX)    {return --posX;}


        // rotação
        static char ViraDireita(char direcao) 
        {
            switch (direcao) 
            {
                case 'N':
                    direcao = 'L';
                    break;

                case 'L':
                    direcao = 'S';
                    break;

                case 'S':
                    direcao = 'O';
                    break;

                case 'O':
                    direcao = 'N';
                    break;
            }
            return direcao;
        }
        static char ViraEsquerda(char direcao)
        {
            switch (direcao)
            {
                case 'N':
                    direcao = 'O';
                    break;

                case 'L':
                    direcao = 'N';
                    break;

                case 'S':
                    direcao = 'L';
                    break;

                case 'O':
                    direcao = 'S';
                    break;
            }
            return direcao;
        }
        #endregion

    }
}
