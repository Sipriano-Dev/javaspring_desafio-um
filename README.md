# Curso Java Spring Professional
Capítulo 1: Componentes e injeção de dependência

## DESAFIO: Componentes e injeção de dependência

Você deve criar um sistema para calcular o valor total de um pedido, considerando uma porcentagem
de desconto e o frete. O cálculo do valor total do pedido consiste em aplicar o desconto ao valor
básico do pedido, e adicionar o valor do frete. A regra para cálculo do frete é a seguinte:

<table>
  <thead>
    <tr align="left">
      <th>Valor básico do pedido (sem desconto)</th>
      <th>Frete</th>
    </tr>
  </thead>
  <tbody align="left">
    <tr>
      <td>Abaixo de R$ 100.00<br>
      </td>
      <td>R$ 20.00
      </td>
    </tr>
    <tr>
      <td>De R$ 100.00 até R$ 200.00 exclusive<br>
      </td>
      <td>R$ 12.00</td>
    </tr>
    <tr>
      <td>R$ 200.00 ou mais</td>
      <td>Grátis</td>   
    </tr>
  </tbody>
  <tfoot></tfoot>
</table>

## Exemplo 1:
<table>
  <thead>
    <tr align="left">
      <th>ENTRADA (dados do pedido: código, valor básico, porcentagem de desconto)</th>
      <th>SAÍDA</th>
    </tr>
  </thead>
  <tbody align="left">
    <tr>
      <td>1034<br>
      150.00<br>
      20.0</td>
      <td>Pedido código 1034<br>
          Valor total: R$ 132.00
      </td>
    </tr>
   
  </tbody>
  <tfoot></tfoot>
</table>

## Exemplo 2:
<table>
  <thead>
    <tr align="left">
      <th>ENTRADA (dados do pedido: código, valor básico, porcentagem de desconto)</th>
      <th>SAÍDA</th>
    </tr>
  </thead>
  <tbody align="left">
    <tr>
      <td>2282<br>
          800.00<br>
          10.0
      </td>
      <td>
          Pedido código 2282<br>
          Valor total: R$ 720.00
      </td>
    </tr>
   
  </tbody>
  <tfoot></tfoot>
</table>

## Exemplo 3:
<table>
  <thead>
    <tr align="left">
      <th>ENTRADA (dados do pedido: código, valor básico, porcentagem de desconto)</th>
      <th>SAÍDA</th>
    </tr>
  </thead>
  <tbody align="left">
    <tr>
      <td>
          1309<br>
          95.90<br>
          0.0
      </td>
      <td>
        Pedido código 1309<br>
        Valor total: R$ 115.90
      </td>
    </tr>
   
  </tbody>
  <tfoot></tfoot>
</table>

Sua solução deverá seguir as seguintes especificações:<br>
Um pedido deve ser representado por um objeto conforme projeto abaixo:<br>

```mermaid
classDiagram
  class Order {
    - Integer code
    - Double basic
    - Double discount
  }
 

```

A lógica do cálculo do valor total do pedido deve ser implementada por componentes (serviços), cada
um com sua responsabilidade, conforme projeto abaixo:<br><br>

<a href="https://ibb.co/9Yv3tqt"><img src="https://i.ibb.co/q1nF5R5/image-2024-07-01-T13-09-11-993-Z.png" alt="image-2024-07-01-T13-09-11-993-Z" border="0"></a><br />
<br>
Serviço OrderService: responsável por operações referentes a pedidos.<br>
Serviço ShippingService: responsável por operações referentes a frete.<br><br>
Sua solução deverá ser implementada em Java com Spring Boot. A saída deverá ser mostrada no log
do terminal da aplicação. Cada serviço deve ser implementado como um componente registrado com
@Service.
