using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Controle_Equipamentos
{
    class Program
    {
        static void Main(string[] args)
        {
            const int maxRegistros = 100;

            // arrays Equipamentos
            int[] idEquipamento = new int[maxRegistros];
            string[] nomeEquipamento = new string[maxRegistros];
            string[] fabricanteEquipamento = new string[maxRegistros];
            string[] numeroDeSerieEquipamento = new string[maxRegistros];
            double[] precoEquipamento = new double[maxRegistros];
            DateTime[] dataAquisicaoEquipamento = new DateTime[maxRegistros];

            //Arrays Chamados
            int[] idChamado = new int[maxRegistros];
            string[] tituloChamado = new string[maxRegistros];
            string[] descricaoChamado = new string[maxRegistros];
            DateTime[] dataAberturaChamado = new DateTime[maxRegistros];
            string[] statusChamado = new string[maxRegistros];

            #region Exemplos Equipamentos
            idEquipamento[0] = 1;
            nomeEquipamento[0] = "furadeira";
            fabricanteEquipamento[0] = "Fabrica Furadeiras";
            precoEquipamento[0] = 55.00;
            dataAquisicaoEquipamento[0] = Convert.ToDateTime("15/05/1990");

            idEquipamento[1] = 2;
            nomeEquipamento[1] = "broca";
            fabricanteEquipamento[1] = "Fabrica Brocas";
            precoEquipamento[1] = 100.00;
            dataAquisicaoEquipamento[1] = Convert.ToDateTime("25/09/2010");

            #endregion
            #region Exemlplos Chamados
            idChamado[0] = 1;
            tituloChamado[0] = "Titulo 1";
            descricaoChamado[0] = "Descricao 1";
            dataAberturaChamado[0] = Convert.ToDateTime("11/11/2020");
            statusChamado[0] = "Aberto";

            idChamado[1] = 2;
            tituloChamado[1] = "Titulo 2";
            descricaoChamado[1] = "Descricao 2";
            dataAberturaChamado[1] = Convert.ToDateTime("01/01/2015");
            statusChamado[1] = "Fechado";

            #endregion

            // exporta o Equipamento arrays
            MenuInicial(idEquipamento,
                        nomeEquipamento,
                        fabricanteEquipamento,
                        numeroDeSerieEquipamento,
                        precoEquipamento,
                        dataAquisicaoEquipamento,
                        // exporta o chamado arrays
                        idChamado,
                        tituloChamado,
                        descricaoChamado,
                        dataAberturaChamado,
                        statusChamado);

        }

        #region Menus
        public static void MenuInicial(int[] idEquipamento, string[] nomeEquipamento, string[] fabricanteEquipamento, string[] numeroDeSerieEquipamento, double[] precoEquipamento,
                                       DateTime[] dataAquisicaoEquipamento, int[] idChamado, string[] tituloChamado, string[] descricaoChamado,
                                       DateTime[] dataAberturaChamado, string[] statusChamado) {
            LimpaTela();
            Print("===========Menu Inicial===========");
            Print("|                                |");
            Print("| (1) Equipamentos               |");
            Print("| (2) Chamados                   |");
            Print("|                                |");
            Print("==================================");
            SelecionaMenu(InputString(), idEquipamento, nomeEquipamento, fabricanteEquipamento,numeroDeSerieEquipamento, precoEquipamento, dataAquisicaoEquipamento, idChamado, tituloChamado,
                          descricaoChamado, dataAberturaChamado, statusChamado);
        }

        public static void MenuEquipamentos(int[] idEquipamento, string[] nomeEquipamento, string[] fabricanteEquipamento,string[] numeroDeSerieEquipamento, double[] precoEquipamento,
                                            DateTime[] dataAquisicaoEquipamento, int[] idChamado, string[] tituloChamado, string[] descricaoChamado,
                                            DateTime[] dataAberturaChamado, string[] statusChamado) {
            string opcao;
            //LimpaTela();
            Print("===========Equipamentos===========");
            Print("|                                |");
            Print("| (1) Listar Equipamentos        |");
            Print("| (2) Adicionar Equipamento      |");
            Print("| (3) Editar Equipamento         |");
            Print("| (4) Excluir Equipamento        |");
            Print("| (0) Menu inicial               |");
            Print("|                                |");
            Print("==================================");
            opcao = InputString();
            if (opcao.Equals("0"))
            {
                SelecionaMenu(opcao, idEquipamento, nomeEquipamento, fabricanteEquipamento,numeroDeSerieEquipamento, precoEquipamento, dataAquisicaoEquipamento, idChamado, tituloChamado,
                              descricaoChamado, dataAberturaChamado, statusChamado);

            }

            else if (opcao.Equals("1"))
            {
                ListarEquipamentos(idEquipamento, nomeEquipamento, fabricanteEquipamento,numeroDeSerieEquipamento, precoEquipamento, dataAquisicaoEquipamento);
            }

            else if (opcao.Equals("2")) {
                AdicionarEquipamento(idEquipamento, nomeEquipamento, fabricanteEquipamento,numeroDeSerieEquipamento, precoEquipamento, dataAquisicaoEquipamento);
            }

            else if (opcao.Equals("3"))
            {
                EditarEquipamento(idEquipamento, nomeEquipamento, fabricanteEquipamento, numeroDeSerieEquipamento, precoEquipamento, dataAquisicaoEquipamento);
            }

            else if (opcao.Equals("4"))
            {
                ExcluirEquipamento(idEquipamento, nomeEquipamento, fabricanteEquipamento, numeroDeSerieEquipamento, precoEquipamento, dataAquisicaoEquipamento);
            }
            Console.Clear();
            MenuEquipamentos(idEquipamento, nomeEquipamento, fabricanteEquipamento,numeroDeSerieEquipamento, precoEquipamento, dataAquisicaoEquipamento, idChamado, tituloChamado,
                             descricaoChamado, dataAberturaChamado, statusChamado);
        }

        public static void MenuChamados(int[] idEquipamento, string[] nomeEquipamento, string[] fabricanteEquipamento, string[] numeroDeSerieEquipamento, double[] precoEquipamento,
                                       DateTime[] dataAquisicaoEquipamento, int[] idChamado, string[] tituloChamado, string[] descricaoChamado,
                                       DateTime[] dataAberturaChamado, string[] statusChamado) {


            string opcao;
            //LimpaTela();
            Print("=============Chamados=============");
            Print("|                                |");
            Print("| (1) Listar Chamados            |");
            Print("| (2) Adicionar Chamado          |");
            Print("| (3) Editar Chamados            |");
            Print("| (4) Excluir Chamados           |");
            Print("| (0) Menu inicial               |");
            Print("|                                |");
            Print("==================================");
            opcao = InputString();

            if (opcao.Equals("0"))
            {
                SelecionaMenu(opcao, idEquipamento,
                  nomeEquipamento,
                  fabricanteEquipamento,
                  numeroDeSerieEquipamento,
                  precoEquipamento,
                  dataAquisicaoEquipamento,
                  idChamado,
                  tituloChamado,
                  descricaoChamado,
                  dataAberturaChamado,
                  statusChamado);
            }
            else if (opcao.Equals("1")) {
                ListarChamados(idChamado, tituloChamado, descricaoChamado, dataAberturaChamado, statusChamado);
            }
            else if (opcao.Equals("2"))
            {
                AdicionarChamado(idChamado, tituloChamado, descricaoChamado, dataAberturaChamado, statusChamado);
            }
            else if (opcao.Equals("3"))
            {
                EditarChamado(idChamado, tituloChamado, descricaoChamado, dataAberturaChamado, statusChamado);
            }
            else if (opcao.Equals("4"))
            {
                ExcluirChamado(idChamado, tituloChamado, descricaoChamado, dataAberturaChamado, statusChamado);
            }
            Console.Clear();
            MenuChamados(idEquipamento, nomeEquipamento, fabricanteEquipamento, numeroDeSerieEquipamento, precoEquipamento, dataAquisicaoEquipamento, idChamado, tituloChamado, descricaoChamado, dataAberturaChamado, statusChamado);
        }

        public static void SelecionaMenu(string opcao, int[] idEquipamento, string[] nomeEquipamento, string[] fabricanteEquipamento, string[] numeroDeSerieEquipamento,
                                         double[] precoEquipamento, DateTime[] dataAquisicaoEquipamento, int[] idChamado,
                                         string[] tituloChamado, string[] descricaoChamado, DateTime[] dataAberturaChamado, string[] statusChamado)
        {
            if (opcao.Equals("0")) { MenuInicial(idEquipamento,nomeEquipamento,fabricanteEquipamento,numeroDeSerieEquipamento,precoEquipamento,dataAquisicaoEquipamento,idChamado,tituloChamado,descricaoChamado,
                                                 dataAberturaChamado,statusChamado); }

            else if (opcao.Equals("1")) { MenuEquipamentos(idEquipamento,nomeEquipamento,fabricanteEquipamento,numeroDeSerieEquipamento,precoEquipamento,dataAquisicaoEquipamento,idChamado,tituloChamado,
                                                           descricaoChamado,dataAberturaChamado,statusChamado); }

            else if (opcao.Equals("2")) { MenuChamados(idEquipamento, nomeEquipamento, fabricanteEquipamento, numeroDeSerieEquipamento, precoEquipamento, dataAquisicaoEquipamento, idChamado, tituloChamado, descricaoChamado, dataAberturaChamado, statusChamado); }
        }
        #endregion

        #region Equipamentos
        public static void ListarEquipamentos(int[] idEquipamento, string[] nomeEquipamento, string[] fabricanteEquipamento, string[] numeroDeSerieEquipamento,
                                              double[] precoEquipamento, DateTime[] dataAquisicaoEquipamento) {
            for (int i = 0; nomeEquipamento[i] != null; i++) {
                Print($"id: {idEquipamento[i]} | Nome: {nomeEquipamento[i]} | Número de série: {numeroDeSerieEquipamento[i]}| Preço: R${Convert.ToString(precoEquipamento[i])} | Data da compra: {Convert.ToString(dataAquisicaoEquipamento[i])}");
            }
            Print("Precione Enter para continuar");
            InputString();


        }

        public static void AdicionarEquipamento(int[] idEquipamento, string[] nomeEquipamento, string[] fabricanteEquipamento, string[] numeroDeSerieEquipamento,
                                              double[] precoEquipamento, DateTime[] dataAquisicaoEquipamento) {
            string nome;
            int i = 0;
            for (i = 0; nomeEquipamento[i] != null; i++) { }
            idEquipamento[i] = i + 1;
            do
            {
                Print("Digite o nome do Equipamento");
                nome = Console.ReadLine();
            } while (VerificadorDeNome(nome));
            nomeEquipamento[i] = nome;
            Print("Digite o nome do fabricante do equipamento");
            fabricanteEquipamento[i] = InputString();
            Print("Digite o número de série do equipamento");
            numeroDeSerieEquipamento[i] = InputString();
            Print("Digite o preco do equipamento");
            precoEquipamento[i] = Convert.ToDouble(Console.ReadLine());
            Print("Digite a data da aquisição (xx/xx/xxx)");
            dataAquisicaoEquipamento[i] = Convert.ToDateTime(Console.ReadLine());
            Print("Adicionado com socesso! Pressione Enter para continuar.");
            InputString();
        }

        public static void EditarEquipamento(int[] idEquipamento, string[] nomeEquipamento, string[] fabricanteEquipamento, string[] numeroDeSerieEquipamento,
                                             double[] precoEquipamento, DateTime[] dataAquisicaoEquipamento) {
            string nome;
            ListarEquipamentos(idEquipamento, nomeEquipamento, fabricanteEquipamento, numeroDeSerieEquipamento, precoEquipamento, dataAquisicaoEquipamento);
            Print("Informe o id do Equipamento que deseja editar");
            int i = Convert.ToInt32(InputString())-1;
            do
            {
                Print("Digite o nome do Equipamento");
                nome = Console.ReadLine();
            } while (VerificadorDeNome(nome));
            nomeEquipamento[i] = nome;
            Print("Digite o fabricante do equipamento");
            fabricanteEquipamento[i] = InputString();
            Print("Digite o numero de série do equipamento");
            numeroDeSerieEquipamento[i] = InputString();
            Print("Digite o preço do equipamento");
            precoEquipamento[i] = Convert.ToDouble(InputString());
            Print("Digite a data da compra do equipamento (xx/xx/xxxx)");
            dataAquisicaoEquipamento[i] = Convert.ToDateTime(InputString());
            Print("Editado com sucesso! Pressione Enter para continuar");
        }

        public static void ExcluirEquipamento(int[] idEquipamento, string[] nomeEquipamento, string[] fabricanteEquipamento, string[] numeroDeSerieEquipamento,
                                             double[] precoEquipamento, DateTime[] dataAquisicaoEquipamento) {
            ListarEquipamentos(idEquipamento, nomeEquipamento, fabricanteEquipamento, numeroDeSerieEquipamento, precoEquipamento, dataAquisicaoEquipamento);
            Print("Informe o id do equipamento que deseja excluir");
            int i = Convert.ToInt32(InputString()) - 1;
            idEquipamento[i] = 0;
            nomeEquipamento[i] = null;
            fabricanteEquipamento[i] = null;
            numeroDeSerieEquipamento[i] = null;
            precoEquipamento[i] = 0;
            dataAquisicaoEquipamento[i] = DateTime.MinValue;
            Print("Excluido com sucesso! Pressione Enter para continuar.");
            InputString();
        }

        #endregion


        #region Chamados
        public static void ListarChamados(int[] idChamado, string[] tituloChamado, string[] descricaoChamado,DateTime[] dataAberturaChamado, string[] statusChamado) {
            for (int i = 0; tituloChamado[i] != null; i++) {
                TimeSpan diferenca = DateTime.Now.Subtract(dataAberturaChamado[i]);
                Print($"id: {idChamado[i]} | Título: {tituloChamado[i]} | Descrição: {descricaoChamado[i]} | Data da abertura: {dataAberturaChamado[i]} | Status: {statusChamado[i]} | Tempo aberto: {diferenca.Days.ToString()} dias");
            }
            Print("Pressione Enter para continuar.");
            InputString();
        }

        public static void AdicionarChamado(int[] idChamado, string[] tituloChamado, string[] descricaoChamado, DateTime[] dataAberturaChamado, string[] statusChamado) {
            int i = 0;
            for (i=0;tituloChamado[i] != null; i++) { }
            idChamado[i] = i + 1;
            Print("Digite o Título do chamado");
            tituloChamado[i] = InputString();
            Print("Digite a descrição do chamado");
            descricaoChamado[i] = InputString();
            Print("Digite a data de abertura (xx/xx/xxx)");
            dataAberturaChamado[i] = Convert.ToDateTime(InputString());
            statusChamado[i] = "aberto";
            Print("Adicionado com sucesso! Pressione Enter para continuar.");
            InputString();
        }

        public static void EditarChamado(int[] idChamado, string[] tituloChamado, string[] descricaoChamado, DateTime[] dataAberturaChamado, string[] statusChamado) {
            ListarChamados(idChamado, tituloChamado, descricaoChamado, dataAberturaChamado, statusChamado);
            Print("Digite o id do chamado a ser editado");
            int i = Convert.ToInt32(InputString());
            Print("Digite o Título do chamado");
            tituloChamado[i] = InputString();
            Print("Digite a descrição do chamado");
            descricaoChamado[i] = InputString();
            Print("Digite a data de abertura (xx/xx/xxx)");
            dataAberturaChamado[i] = Convert.ToDateTime(InputString());
            Print("Digite o Status do chamado");
            statusChamado[i] = InputString();
            Print("Editado com sucesso! Pressione Enter para continuar.");
        }

        public static void ExcluirChamado(int[] idChamado, string[] tituloChamado, string[] descricaoChamado, DateTime[] dataAberturaChamado, string[] statusChamado) {
            ListarChamados(idChamado, tituloChamado, descricaoChamado, dataAberturaChamado, statusChamado);
            Print("Digite o id do chamado a ser excluido");
            int i = Convert.ToInt32(InputString()) - 1;
            idChamado[i] = 0;
            tituloChamado[i] = null;
            descricaoChamado[i] = null;
            dataAberturaChamado[i] = DateTime.MinValue;
            statusChamado[i] = null;
            Print("Excluido com sucesso! Pressione Enter para continuar.");
        }

        #endregion

        #region Interações com a tela

        public static void Print(string entrada) {
            Console.WriteLine(entrada);
        }

        public static string InputString() {
            return Console.ReadLine();
        }

        public static void LimpaTela() {
            Console.Clear();
        }

        #endregion

        public static bool VerificadorDeNome(string nome) {
            if (nome.Length < 6) {
                Print("Nome menor que 6 digitos.");
                return true;
            } else { return false; }
        }
    }

}
