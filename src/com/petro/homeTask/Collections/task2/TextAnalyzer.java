package com.petro.homeTask.Collections.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/** Необходимо реализовать анализатор текста, который
 *  принимает строку и проверяет,
 *  что у неё закрыты все открытые скобки

 Пример:
 “[({})]” - корректно
 “[(){}” - не корректно
*/
 public class TextAnalyzer {
 public static void main(String[] args) {


  String text = "((()))[]{}{}[]";

  TextAnalyzer run = new TextAnalyzer();

  run.bracketsAnalyzer(text);
 }

 void bracketsAnalyzer(String text){
  text = text.toLowerCase();
  boolean isClosed=false;

  //Создал 2 хеш мапы для хранения значений открытх и закрытых скобок
  Map<Character,Integer> mapOpenedBrackets = new HashMap<>();
  Map<Character,Integer> mapClosedBrackets = new HashMap<>();
  //Перевод текста в чар
  for (int i = 0; i < text.length(); i++) {
   char ch=text.charAt(i);

   if (ch=='{'){
    mapOpenedBrackets.merge(ch,1,Integer::sum);
   }
   if (ch=='('){
    mapOpenedBrackets.merge(ch,1,Integer::sum);
   }
   if (ch=='['){
    mapOpenedBrackets.merge(ch,1,Integer::sum);
   }
   if (ch=='}'){
    mapClosedBrackets.merge(ch,1,Integer::sum);
   }
   if (ch==')'){
    mapClosedBrackets.merge(ch,1,Integer::sum);
   }
   if (ch==']'){
    mapClosedBrackets.merge(ch,1,Integer::sum);
   }

  }

  //проверка на количество открытых и закрытых скобок

  if (mapOpenedBrackets.get('(')==mapClosedBrackets.get(')')){
   System.out.println("Количество открытых и закрытых ( совпадает");
  }else {
   System.out.println("Закройте круглые скобки!!!");
   isClosed=true;
  }

  if (mapOpenedBrackets.get('{')==mapClosedBrackets.get('}')){
   System.out.println("Количество открытых и закрытых { совпадает");
  }else {
   System.out.println("Закройте фигурные скобки!!!");
   isClosed=true;
 }


  if (mapOpenedBrackets.get('[')==mapClosedBrackets.get(']')){
   System.out.println("Количество открытых и закрытых [ совпадает");
  }else {
   System.out.println("Закройте квадратный скобки!!!");
   isClosed=true;
  }

//вывод коректно ли нет
  if (!isClosed) System.out.println("Коректно");
  else System.out.println("НЕ коректно");

//копирование Хеш мапи в аррейЛист и вывод
  ArrayList<Map.Entry<Character,Integer>> entries =
          new ArrayList<>(mapOpenedBrackets.entrySet());
  for (Map.Entry<Character,Integer> entry:entries ) {
   System.out.print(entry.getKey()+"--"+entry.getValue());
   System.out.print("   ");
  }
  System.out.println();

  ArrayList<Map.Entry<Character,Integer>> entries1 =
          new ArrayList<>(mapClosedBrackets.entrySet());
  for (Map.Entry<Character,Integer> entry:entries1 ) {
   System.out.print(entry.getKey()+"--"+entry.getValue());
   System.out.print("   ");
  }
 }
}



