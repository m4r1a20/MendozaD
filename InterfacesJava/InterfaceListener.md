# Interface Listener

**MouseListener**  
Permitira escuchar los eventos de tipo MouseEvent, que son los producidos por el ratón al interaccionar con cualquiera de las clases.

MÉTODOS
+ mouseClicked(MouseEvent)
+ mouseEntered(MouseEvent)
+ mouseExted(MouseEvent)
+ mousePressed(MouseEvent)
+ mouseReleased(MouseEvent)

**ContainerListener**  
Estos eventos son para la notificación solamente - no escucha envase necesita estar presente para los componentes que se agregan o se quitan con éxito.  

MÉTODOS  
+ componenAdded(ComponentEvent)
+ componentRemoved(ComponentEvent)

**ActionListener**  
Se usa para detectar y manejar eventos de acción.  

MÉTODOS
+ actionPerfomed(ActionEvent)  

**AdjustmentListener**  
Para escuchar los eventos de tipo AdjustmentEvent produciods por la clase JScrollbar deberemos implementar la interfaz Component Listener.  

MÉTODOS  
+ adjustmentValueChange(AdjustmentEvent)  
  
**ItemListener**  

  MÉTODOS  
  + itemStateChanged(ItemEvent)  
  
  **ComponentListener**  
  Para marcar un objeto con la capacidas de escuchar eventos de tipo ComponentEvent deberemos implementar la interfaz ComponentListener.  

  MÉTODOS  
  + componentHidden(ComponentEvent)
  + componentMoved(ComponentEvent)
  + componentResized(ComponentEvent)
  + componentShow(ComponentEvent)  

**FocusListener**  
Cuando un componente recibe el foco, es decir, es el elemento de la pantalla que está activo se producen eventos de tipo FocusEvent.  

MÉTODOS  
+ focusGained(FocusEvent)
+ focusLost(FocusEvent)  

**KeyListener**  
Se puede detectar y tratar los eventos generados por la pulsación de una techa o por una combinaciones de ellas.  

MÉTODOS  
+ keyPressed(KeyEvent)
+ keyReleased(KeyEvent)
+ keyTyped(KeyEvent)

https://iestpa.foroactivo.com/t186-cuales-son-las-interfaces-listener-y-sus-metodos-en-java