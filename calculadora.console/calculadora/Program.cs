using System;
using System.Collections;
using System.Threading;


namespace calculadora
{
    class Program
    {
        static void Main(string[] args)
        {

            string operacao = ("");
            ArrayList log = new ArrayList();

            while (operacao != "sair")
            {
                // Título e começo da descrição

                Cabecalho();

                // Recebe a operação

                operacao = Console.ReadLine();

                // Declarações de variáveis

                double segundoNumero;
                double primeiroNumero;
                double resultado = 0;


                if (VerificadorOperacao(operacao))
                {
                    Console.ForegroundColor = ConsoleColor.Red;
                    Console.WriteLine("Operação inválida");
                    Console.ResetColor();
                    Console.WriteLine("Reiniciando sistema...");
                    Thread.Sleep(2000);
                    Console.WriteLine();
                    Console.Clear();

                }
                else
                {

                    if (operacao.Equals("sair", StringComparison.OrdinalIgnoreCase))
                    {
                        break;
                    }

                    if (operacao.Equals("his", StringComparison.OrdinalIgnoreCase))
                    {
                        Historico(log);
                    }
                    else
                    {
                        Console.WriteLine("Digite o primeiro valor");
                        primeiroNumero = Convert.ToDouble(Console.ReadLine());
                        // Verificador de numero 0 na 2ª posição
                        do
                        {
                            Console.WriteLine("Digite o segundo valor");
                            segundoNumero = Convert.ToDouble(Console.ReadLine());
                            if (segundoNumero == 0)
                            {
                                Console.ForegroundColor = ConsoleColor.Red;
                                Console.WriteLine("Número inválido, tente novamente...");
                                Console.ResetColor();
                            }
                        } while (segundoNumero == 0 && operacao == "%");

                        Console.WriteLine("Resultado:");

                        // Operações

                        switch (operacao)
                        {
                            case "x":
                                resultado = Multiplicacao(primeiroNumero, segundoNumero);
                                Console.WriteLine(resultado);
                                break;

                            case "%":
                                resultado = Divisao(primeiroNumero, segundoNumero);
                                Console.WriteLine(resultado);
                                break;

                            case "-":
                                resultado = Subtracao(primeiroNumero, segundoNumero);
                                Console.WriteLine(resultado);
                                break;

                            case "+":
                                resultado = Soma(primeiroNumero, segundoNumero);
                                Console.WriteLine(resultado);
                                break;
                        }

                        Console.WriteLine("Pressione Enter para continuar...");
                        Console.ReadLine();
                        Console.Clear();

                        // registro de logs
                        log.Add("Operação: " + primeiroNumero + " " + operacao + " " + segundoNumero + " = " + resultado);
                    }
                }
            }
        }

        private static void Cabecalho()
        {
            Console.WriteLine("=====Calculadora v 1.7.1=====");
            Console.WriteLine();
            Console.WriteLine("qual operação deseja fazer?");
            Console.WriteLine("+  -  x  % ");
            Console.WriteLine("caso deseje sair digite 'sair'");
            Console.WriteLine("caso deseje acessar o hitórico digite: 'his'");
        }

        private static bool VerificadorOperacao(string operacao)
        {
            return operacao != "+" && operacao != "-" && operacao != "x" && operacao != "%" && !(operacao.Equals("sair", StringComparison.OrdinalIgnoreCase)) && !(operacao.Equals("his", StringComparison.OrdinalIgnoreCase));
        }

        static double Soma(double num1, double num2)
        {
            //double soma = num1 + num2;

            return (num1 + num2);
        }

        static double Subtracao(double num1, double num2)
        {

            //double subtracao = num1 - num2;
            return (num1 - num2);
        }

        static double Multiplicacao(double num1, double num2)
        {
            //double multiplicacao = num1 * num2;
            return (num1 * num2);
        }
        static double Divisao(double num1, double num2)
        {
            //double multiplicacao = num1 * num2;
            return (num1 / num2);
        }
        static void Historico(ArrayList log)
        {
            if (log.Count == 0)
            {

                Console.WriteLine("Hitórico vazio.");

            }
            else
            {

                Console.WriteLine("=====Histórico=====");

                int valor = 0;
                foreach (String aux2 in log)
                {

                    Console.WriteLine(aux2);
                    valor++;
                }
                Console.WriteLine("===================");
                Console.WriteLine("Pressione qualquer tecla para continuar...");
                Console.ReadLine();
                Console.Clear();
            }

            return;
        }
    }
}
