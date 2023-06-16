
package c306.sudoku;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import java.lang.Math;

import java.util.*;

public class TestGrilleImpl {

@Test
void testGetElements1() {

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]);    

assertTrue(elements2.equals(g.getElements()));


}



@Test
void testDimension(){
ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	

assertTrue(g.getDimension()==elements.length);

}



@Test
void testSetValue1(){
ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};


GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	


try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);
g.setValue(4,4,e2);
fail("");
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	System.out.println("Exception : "+e );
	
}


}




@Test
void testSetValue2(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	


try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);
g.setValue(1,1,new ElementDeGrilleImplAsChar('5'));
fail("");
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	System.out.println("Exception : "+e );
	
}


}


@Test
void testSetValue3(){
ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	


try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);
g.setValue(2,1,e1);
fail("");
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	System.out.println("Exception : "+e );
	
}


}


@Test
void testSetValue4(){
ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	


try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);
g.setValue(0,0,e1);
fail("");
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	
	System.out.println("Exception : "+e );
}


}



@Test
void testSetValue5(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	


try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);
g.setValue(2,2,new ElementDeGrilleImplAsChar('2'));
fail("");
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	System.out.println("Exception : "+e );
	
}


}


@Test
void testSetValue6(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	


try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);
g.setValue(1,1,e2);

	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
System.out.println("Exception impo--------- : "+e );	
	
}


}
@Test
void testSetValue7(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	


try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);
g.setValue(0,0,new ElementDeGrilleImplAsChar(e3.getValeur()));
assertFalse(g.isValeurInitiale(0,0));
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
System.out.println("Exception impo : "+e );	
	
}


}
@Test
void testSetValue8(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	


try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);
g.setValue(0,0,e4);
fail("");
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
System.out.println("Exception impo : "+e );	
	
}


}
@Test
void testSetValue9(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	


try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);
g.setValue(1,4,e1);
fail("");
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
System.out.println("Exception impo : "+e );	
	
}


}
@Test
void testSetValue10(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	


try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);
g.setValue(3,3,null);

assertTrue(g.getValue(3,3)==null);
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
System.out.println("Exception valeur null: "+e );	
	
}


}
@Test
void testSetValue11(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	


try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);
g.setValue(4,3,e1);
fail("");
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
System.out.println("Exception");	
	
}


}

@Test
void testGetValue1(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	
	



try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);
g.getValue(3,4);

fail("");	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	System.out.println("Exception : "+e );
	
}


}

@Test
void testGetValue2(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	



try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);

g.getValue(4,1);
fail("");	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	System.out.println("Exception : "+e );
	
}


}


@Test
void testGetValue3(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	



try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);

g.getValue(4,4);
fail("");	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	System.out.println("Exception : "+e );
	
}


}



@Test
void testGetValue5(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	



try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);

assertEquals(e1,g.getValue(0,1));
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	System.out.println("Exception : "+e );
	
}


}




@Test
void testIsPossible1(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	



try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);

g.isPossible(4,4,e1);
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	System.out.println("Exception : "+e );
	
}


}

@Test
void testIsPossible2(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	



try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);

g.isPossible(4,2,e1);
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	System.out.println("Exception : "+e );
	
}


}

@Test
void testIsPossible3(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	



try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);

g.isPossible(1,4,e1);
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	System.out.println("Exception : "+e );
	
}


}

@Test
void testIsPossible4(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	



try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);

g.isPossible(1,1,new ElementDeGrilleImplAsChar('5'));
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	System.out.println("Exception : "+e );
	
}


}

@Test
void testIsPossible5(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	



try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);

assertTrue(g.isPossible(1,1,new ElementDeGrilleImplAsChar('4')));
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	System.out.println("Exception : "+e );
	
}


}
@Test
void testIsPossible6(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	



try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);

assertTrue(g.isPossible(1,1,null));
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	System.out.println("Exception : "+e );
	
}


}

@Test
void testIsComplete(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	



try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);

assertFalse(g.isComplete());
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	System.out.println("Exception : "+e );
	
}


}

@Test
void testIsValeurInitial1(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	



try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);

assertTrue(g.isValeurInitiale(0,1));
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	System.out.println("Exception : "+e );
	
}


}

@Test
void testIsValeurInitial2(){

ElementDeGrilleImplAsChar e1=new ElementDeGrilleImplAsChar('1');
ElementDeGrilleImplAsChar e2=new ElementDeGrilleImplAsChar('2');
ElementDeGrilleImplAsChar e3=new ElementDeGrilleImplAsChar('3');
ElementDeGrilleImplAsChar e4=new ElementDeGrilleImplAsChar('4');

ElementDeGrille [] elements={e1,e2,e3,e4};

GrilleImpl g=new GrilleImpl(elements);

Set <ElementDeGrille> elements2=new HashSet<ElementDeGrille>();

  for(int i=0;i<elements.length;i++)
       elements2.add(elements[i]); 	
	



try{

g.setValue(0,1,e1);
g.setValue(2,1,e3);
g.setValue(0,2,e4);
g.setValue(1,2,e3);
g.setValue(2,2,e1);
g.setValue(0,3,e2);
g.setValue(1,0,new ElementDeGrilleImplAsChar('4'));


assertFalse(g.isValeurInitiale(1,0));
	
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	System.out.println("Exception valeur initialll: "+e );
	
}


}



}