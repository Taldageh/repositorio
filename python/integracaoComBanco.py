# como integrar python com sql sever usando a blibioteca pyodbc

# primeiro é necessário instalar a biblioteca pyodbc
# você pode fazer isso usando o pip: pip install pyodbc

import pyodbc

# começamos a configurar a conexão com o banco de dados SQL Server

dados_conexao = (
    #colocar o driver do SQL Server
    "Driver={SQL Server};"
    #colocar o nome do servidor
    "Server=hostname;"
    #colocar o nome do banco de dados
    "Database=DatabaseName;"
)

# agora vamos adicionar a conexão para a blibioteca pyodbc
conexao = pyodbc.connect(dados_conexao #, autocommit=True # <- se quiser que as alterações sejam salvas automaticamente  
                         )

cursor = conexao.cursor()

comando = """
--colocar o comando SQL que deseja executar"""

#colocar o comando para ser executado pelo cursor
cursor.execute(comando)   
cursor.commit()  # use isso se não tiver usado autocommit na conexão