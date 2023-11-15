# Eliminacion-Gaussiana-2.0
ELIMINACIÓN GAUSSIANA 
El método de Gauss también se conoce como eliminación gaussiana. Este método es muy importante, ya que te permite resolver matrices de una manera sistemática y siguiendo un proceso paso por paso. Este método se utiliza en muchas áreas, que se apoyan en su increíble poder para resolver ecuaciones: ciencia, tecnología, economía e, incluso, ciencias sociales. 
El método de eliminación gaussiana consiste en:
1.	Llevar un sistema de ecuaciones a la forma matricial.
2.	Convertir una matriz cuadrada en una matriz triangular superior, que es equivalente a la matriz original.
3.	Resolver el sistema, sustituyendo las variables en cada ecuación resultante.
La matriz ampliada del sistema AX=b es la matriz formada por las matrices A y b, separadas normalmente por una raya:
 
La fila i de la matriz ampliada contiene los coeficientes de las incógnitas y el término independiente de la ecuación i del sistema.
Resolución con el método gaussiano
 
Realizamos operaciones elementales fila para obtener la matriz en forma escalonada reducida:
A la segunda fila le restamos la primera y a la tercera se la sumamos:
 
Multiplicamos la primera fila por 1/2 y la segunda por 1/3:
 
Sumamos a la primera fila la segunda multiplicada por 1/2 y a la tercera, la segunda multiplicada por -2:
 
Multiplicamos la tercera fila por 1/3:
 
Sumamos a la primera fila la tercera multiplicada por -3/2:
 
Esta última matriz es la escalonada reducida (lo sabemos porque tenemos la matriz identidad).
Calculamos los rangos:
 
Como los rangos coinciden y son máximos, la solución es:
 
