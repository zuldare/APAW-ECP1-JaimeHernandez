# APAW. ECP1. PATRONES DE DISEÑO
#### Asignatura: *Arquitectura y Patrones par Aplicaciones Web*
#### [Máster en Ingeniería Web por la U.P.M.](http://miw.etsisi.upm.es)

### Tecnologías
* Java
* Maven
* Eclipse
* GitHub

### Descripción
La práctica consiste en la implementación de los siguientes patrones:

1. Factoría con patrón _Singleton_. Se almacenan y se buscan las entidades por su id de la entidad principal, pero la factoría no los crea. Debe ir con test de prueba.
2. _Builder_ de la entidad dada en la retroalimentación. Debe ir con su test de pruebas.
3. Patrón _Composite_ de la entidad dada en la retroalimentación. La entidad no puede ser cambiada de su interfaz público dado. Posee 2 métodos
	1. Método _view()_ se visualiza la id si es una entidad y name(string) si es agrupación. Para darle una mejor visibilidad, si se trata de una entidad se mostrará _Nodo[name]_ mientras que si es una entidad, se mostrará _Hoja[Task(id)]_
	2. De igual manera, también se implementará un método _viewBranchBrothers()_ que mostrará todos los nodos del siguiente nivel que cuelgan de una agrupación concreta, se visualizarán _Nodo[name] tiene Hoja[Task(id)]; Nodo[name] tiene Nodo[name]; ..... 
4. Patrón _Strategy_. Bucar, comprender, explicar y realizar un ejemplo propio de su funcionamiento.

