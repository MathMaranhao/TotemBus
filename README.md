# TotemBus 🚌

![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)

Projeto de Implementação de um CRUD para adicionar itens de itinerários de uma rota de ônibus com a utilização da metodologia XP

Link para acessar a documentaçao no google docs: https://docs.google.com/document/d/1e296veHpzyxaluV_H3vixfmxF5lEik3FnjeY1kmCCcs/edit?usp=sharing

## DOR (Definition of Ready)

* A história de usuário deve ser escrita no padrão INVEST
* Os critérios de aceitação estão bem definidos
* Os testes de aceitação devem ser escritos no padrão BDD
* O design da tela deve estar pronto

## DOD (Definition of Done)

* Testes unitários devem ter sido criados
* Todas as funcionalidades foram testadas
* O código foi revisado por um colega do projeto
* As funcionalidades atendem aos critérios de aceitação
* Apresentado as partes interessadas

## História de Usuarios

<table class="tg">
<thead>
  <tr>
    <th class="tg-0pky"><span style="font-weight:bold">Cartão:</span> 05</th>
    <th class="tg-0pky"><span style="font-weight:bold">Projeto:</span> Totem de Consulta das Linhas de Ônibus de São Luís</th>
    <th class="tg-0pky"><span style="font-weight:bold">Estimativa:</span> 03</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-0pky" colspan="2"><span style="font-weight:bold">Nome da História: </span>Cadastro de Itens de Itinerário</td>
    <td class="tg-0pky"><span style="font-weight:bold">Data:</span> 19/12/2022</td>
  </tr>
  <tr>
    <td class="tg-0pky" colspan="2"><span style="font-weight:bold">História:</span> Como auxiliar de cadastro, preciso de uma interface que possibilite manter os dados dos itens de itinerários, para que seja possível visualizar todos os locais possíveis e que as informações geradas possam ser utilizadas no cadastro dos itinerários.</td>
    <td class="tg-0pky"><span style="font-weight:bold">Critério(s) de Aceitação:</span><br><br>*Dado que o usuário logado é um Auxiliar de Cadastro/Quando informado a descrição do item, o tipo do item e ao clicar no botão [SALVAR]/Então deverá ser verificado se a descrição e o tipo do item não estão vazios, caso esteja o usuário deve ser informado e o item não deve ser cadastrado, pois não deverá ser permitido o cadastro de um item de itinerário vazio.<br><br>*Dado que o usuário logado é um Auxiliar de Cadastro/Quando informado a descrição do item, o tipo do item e ao clicar no botão [SALVAR]/Então deverá ser verificado se o item cadastrado já existe, caso exista o usuário deve ser informado e o item não deve ser cadastrado, pois não deverá ser permitido o cadastro de itens repetidos;<br><br>Dado que o usuário logado é um Auxiliar de Cadastro/Quando não for selecionado um item de itinerário e ao clicar no botão [ALTERAR]/Então deverá ser informado ao usuário que nenhum item foi selecionado e nenhum dado pode ser alterado.<br><br>*Dado que o usuário logado é um Auxiliar de Cadastro/Quando selecionado um item de itinerário e ao clicar no botão [ALTERAR]/Então deverá ser verificado se a descrição do item e o tipo do item não estão vazios, caso um dos itens esteja vazio, o usuário deve ser informado e a alteração do item não deve ser realizada, pois não deverá ser possível itens de itinerários vazios.<br><br>*Dado que o usuário logado é um Auxiliar de Cadastro/Quando selecionado um item de itinerário e ao clicar no botão [ALTERAR]/Então deverá ser verificado se o item que deseja alterar já existe, caso exista o usuário deve ser informado e o item não deve ser alterado, pois não deverá ser permitido o cadastro de itens repetidos;<br><br>*Dado que o usuário logado é um Auxiliar de Cadastro/Quando selecionado um item de itinerário e ao clicar no botão [EXCLUIR]/Então deverá ser apresentado ao usuário um caixa de seleção para a confirmação de exclusão do item, caso o usuário clique em sim, o item deve ser excluído, caso contrário o item deve permanecer na base.<br><br>*Dado que o usuário logado é um Auxiliar de Cadastro/Quando não for selecionado um item de itinerário e ao clicar no botão [EXCLUIR]/Então deverá ser informado ao usuário que nenhum item foi selecionado e nenhum dado pode ser excluído.<br><br>*Dado que o usuário logado é um Auxiliar de Cadastro/Quando selecionado o botão [LIMPAR]/Então os campos de cadastro deverão ser resetados, para que novos itens possam ser cadastrados.<br><br>*Dado que o usuário logado é um Auxiliar de Cadastro/Quando ao digitar no caixa de texto de argumento de pesquisa /Então deverá ser apresentado em uma tabela o item conforme o argumento digitado. <br><br>*Dado que o usuário logado é um Auxiliar de Cadastro/Quando selecionado o botão [LIMPAR PESQUISA]/Então o campo de argumento de pesquisa deve ser resetado, para que um novo argumento possa ser escrito ou para que todos os dados cadastrados sejam visualizados.</td>
  </tr>
  <tr>
    <td class="tg-0pky" colspan="2"><span style="font-weight:bold">Observações: </span>Para nossa aplicação precisamos que existam tipos de itens de itinerário cadastrados, como por exemplo: Bairro e Ponto turístico.</td>
    <td class="tg-0pky"><span style="font-weight:bold">Risco:</span> Médio <br><br>Esta funcionalidade será utilizada para cadastrar todos os locais disponíveis em São Luís, esses dados serão utilizados na montagem de itinerários.</td>
  </tr>
</tbody>
</table>

## Tarefas (Padrão SMART)

Id  |Tarefa                                                             | Tempo de Execução (Dias) | Resposavel
:--:| :---------                                                        | :------:                 | :---------: 
01  | Organizar o projeto de acordo com o padrão MVC                    | 1                        | Gabriel
02  | Criação da classe de conexão com o banco de dados                 | 1                        | Gabriel
03  | Criação do Model Item de Itinerário e tipo do item de itinerário  | 1                        | Gabriel
04  | Desenvolver a  funcionalidade de cadastrar um item de itinerário  | 2                        | Matheus
05  | Desenvolver a funcionalidade de alterar um item de itinerário     | 2                        | Matheus
06  | Desenvolver a funcionalidade de excluir um item de itinerário     | 2                        | Matheus
07  | Desenvolver a funcionalidade de pesquisar um item de itinerário   | 1                        | Matheus
08  | Desenvolver o Front-end da aplicação                              | 3                        | Matheus
09  | Testar todas as funcionalidades                                   | 2                        | Gabriel
10  | Integrar todas as funcionalidades desenvolvidas                   | 2                        | Gabriel

## Exemplo de Refatoração

* Codigo não refatorado

~~~java

private void btnCadastrarItemItinerarioActionPerformed(java.awt.event.ActionEvent evt) {

        if (jtfId.getText().isEmpty()) {
            if (!jtfDescricao.getText().isEmpty() && !cbxTipoItemItinerario.getSelectedItem().equals("Selecione")) {
                ModelItemItinerario = new ModelItemItinerario();
                ModelItemItinerario.setDescricaoItem(jtfDescricao.getText());
                ModelItemItinerario.setIdTipoItem(idTipoItemItinerario.get(cbxTipoItemItinerario.getSelectedIndex() - 1));

                if (controllerItemItinerario.cadastrarItemItinerario(ModelItemItinerario)) {
                    JOptionPane.showMessageDialog(this, "Item cadastrado com sucesso", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    limparItensDeCadastro();
                    carregarTabelaItensItinerario();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao cadastrar o item", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar o item, pois um item está selecionado", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }

~~~

* Codigo Refatorado
~~~java
public boolean validarCampoIdParaCadastro() {
        if (jtfId.getText().isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Não foi possivel cadastrar pois um item está selecionado, favor limpar os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
public boolean validarCampoDescricao() {
        if (jtfDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "A descrição não pode ser vazia", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

public boolean validarCampoTipo() {
        if (cbxTipoItemItinerario.getSelectedItem().equals("Selecione")) {
            JOptionPane.showMessageDialog(this, "O campo tipo não pode ser vazio", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

private void btnCadastrarItemItinerarioActionPerformed(java.awt.event.ActionEvent evt) {                                                           

        if (validarCampoIdParaCadastro() == true && validarCampoDescricao() == true && validarCampoTipo() == true) {
            ModelItemItinerario = new ModelItemItinerario();
            ModelItemItinerario.setDescricaoItem(jtfDescricao.getText());
            ModelItemItinerario.setIdTipoItem(idTipoItemItinerario.get(cbxTipoItemItinerario.getSelectedIndex() - 1));

            if (controllerItemItinerario.cadastrarItemItinerario(ModelItemItinerario)) {
                JOptionPane.showMessageDialog(this, "Item cadastrado com sucesso", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                limparItensDeCadastro();
                carregarTabelaItensItinerario();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar o item", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }  
~~~


## Exemplo de Teste



## Tela de Cadastro de Intinerarios

![](https://github.com/MathMaranhao/TotemBus/blob/main/Tela%20de%20Cadastro%20dos%20itens%20de%20itinerario.png)




