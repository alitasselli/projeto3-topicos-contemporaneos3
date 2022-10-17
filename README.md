# projeto3-topicos-contemporaneos3
projeto 3 – empreendimento e crédito rural

regras de negócio

1.1.1 - código, alfanumérico de 12 caracteres e obrigatório
        error :
        menor ou maior que 12 length 
        caractere diferente de números e letras
        sucess :
        string de 12 letras 
        código, 12 alfanumerico -  seria um id de um usuario
        options :
        números ou letras ou letras e números
			
1.1.2 - descrição, alfa de até 50 caracteres, obrigatório (diferente de nulo e branco)
        error :
        nulo ou branco 
				mais de 50 caracteres
			  números
				sucess : 
				strings de até 50 caracters 
        obs : 
				split -> regex - dentro de cada caractere quebre uma string
					for para cada vez que tiver um espaco e quebre gerando arrays de string
					somatorio de quantas substrings existem e do array length
				
1.1.3 - taxa de juros, número decimal, obrigatório
        error :
        número negativo
				pontuação diferente de vírgula
        números com poncertagens altas como 100%
				sucess :
        soma o valor total

1.1.4 - alíquota de seguro, número decimal, obrigatatório
        alíquota de seguro, valor total x aliquota de seguros que é o juros
				dinheiro + taxa de juros 
        *crud ser consultado -> quando a consumacao requisitar um codigo id ver 
					se o cod existe -> liberar para cred rural
				*try catch -> se não for cadastrado não liberar

data - 
      caso de aceitacao -> data ser no formato dia/mes/ano somente com caracteres
						numericos e a barra / maior ou igual do que a data atual
			*se for a data inferior a data atual -> msg de erro
			*se a data for no formato diferente de dia/mes/ano -> msg de erro
			*se tiver caracteres diferentes de numero e / -> msg de erro

cpf  - CPF do cliente, alfa de 11 caracteres, CPF válido
      error :
      maior ou menor que 11 dígitos
      caracters diferentes de números
      sucess :
			verificar se e valido -> LIB que faz soma 
      verificar o dígito verificador -> tem como um calculo ai

