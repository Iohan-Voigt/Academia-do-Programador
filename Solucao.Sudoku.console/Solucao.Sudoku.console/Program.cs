using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace Solucao.Sudoku.console
{
    class Program
    {
        static void Main(string[] args) {
            #region entrada do sudoku
            string sudoku = @"1 3 2 5 7 9 4 6 8
4 9 8 2 6 1 3 7 5
7 5 6 3 8 4 2 1 9
6 4 3 1 5 8 7 9 2
5 2 1 7 9 3 8 4 6
9 8 7 4 2 6 5 3 1
2 1 4 9 3 5 6 8 7
3 6 5 8 1 7 9 2 4
8 7 9 6 4 2 1 5 3";
            #endregion
            Console.WriteLine(VerificadorDe5(sudoku));
            Console.WriteLine(VerificadorDeLinha(sudoku));
            Console.WriteLine(VerificadorDeColuna(sudoku));
            if (VerificadorDe5(sudoku) && VerificadorDeLinha(sudoku) && VerificadorDeColuna(sudoku)){
                Console.WriteLine("YES");
            }
            else {
                Console.WriteLine("NO");
            }

            Console.ReadLine();
        }

        static bool VerificadorDeLinha(string sudoku) {
            
            var leitorDeString = new StringReader(sudoku);
            string linha;
            string[] linhaArr;
            int indiceDeVerificacao = 0, total = 0;

            while ((linha = leitorDeString.ReadLine()) != null)
            {
                linhaArr = linha.Split(' ');
                total = 0;

                for (int i = 0; i < 9; i++)
                {
                    total = total + Convert.ToInt32(linhaArr[i]);
                    
                }
                if (total != 45) {
                    indiceDeVerificacao = 1;
                    break;
                }
            }


            if (indiceDeVerificacao == 1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }

        static bool VerificadorDe5(string sudoku) {
            string linha;
            string[] linhaArr;
            var leitorDeString = new StringReader(sudoku);
            int quantidadeDe5 =0;
            while ((linha = leitorDeString.ReadLine()) != null)
            {

                quantidadeDe5 = 0;
                linhaArr = linha.Split(' ');
                for (int i = 0; i < 9; i++)
                {
                    if (linhaArr[i] == "5")
                    {
                        quantidadeDe5++;
                    }
                }
            }
            if (quantidadeDe5 != 1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }

        static bool VerificadorDeColuna(string sudoku) {
            string linha;
            string[] linhaArr;
            int indiceDeVerificacao = 0, total = 0;

            // percorre as 9 colunas
            for (int j = 0 ; j < 9; j++) {
                // percorre as 9 linhas
                 for (int i = 0; i < 9; i++) {
                    total = 0;
                    var leitorDeString = new StringReader(sudoku);
                    while ((linha = leitorDeString.ReadLine()) != null)
                     {
                         linhaArr = linha.Split(' ');
                         total = total + Convert.ToInt32(linhaArr[i]);
                        if (total != 45)
                        {
                            indiceDeVerificacao = 1;
                        }
                    }
                }               

            }
            if (indiceDeVerificacao == 1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

    }
}
