package com.pro100denysko.app;

import com.pro100denysko.app.task_1.FishSale;
import com.pro100denysko.app.task_1.FishUtil;
import com.pro100denysko.app.task_2.*;
import com.pro100denysko.app.task_3.*;
import com.pro100denysko.app.task_4.Age;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        ///////////////////////////////////
        // TODO Task 1

        System.out.println("Task 1");
        List<FishSale> listOfFishes = new ArrayList<>();

        listOfFishes.add(new FishSale("Clown Fish", 200.0, "25.7.2017", 400.0, "30.7.2017", 2, 1.5));
        listOfFishes.add(new FishSale("Clown Fish", 200.0, "25.7.2017", 400.0, "26.7.2017", 2.3, 1.5));
        listOfFishes.add(new FishSale("Carp", 150.0, "6.11.2017", 250.0, "12.12.2017", 1.5, 2));
        listOfFishes.add(new FishSale("Carp", 150.0, "6.11.2017", 250.0, "24.12.2017", 2, 2));
        listOfFishes.add(new FishSale("Trout", 400.0, "10.6.2017", 800.0, "15.6.2017", 4, 3));

        FishUtil.sort(listOfFishes);
        System.out.println();

///////////////////////////////////
        // TODO Task 2

        System.out.println("Task 2");

        List<Document> listOfDocuments = new ArrayList<>();
        listOfDocuments.add(new Book("Harry Potter And The Deathly Hallows", "The huge snake emerged to climb slowly up Vol de mort’s chair.\n" +
                "It rose, seemingly endlessly, and came to rest across Vol de mort’s\n" +
                "shoulders: its neck the thickness of a man’s thigh; its eyes, with their\n" +
                "vertical slits for pupils, unblinking. Vol de mort stroked the creature\n" +
                "absently with long thin fi ngers, still looking at Lucius Malfoy", "J. K. Rowling", "Raincoast", "A"));
        listOfDocuments.add(new Article("Harry Potter And The Deathly Hallows", "Rowling's genius is not just her total realisation of a fantasy world,\n" +
                " but the quieter skill of creating characters that bounce off the page, real and flawed and brave and lovable",
                "Alice Fordham", "The Times", 2010, 10));
        listOfDocuments.add(new WikiArticle("Harry Potter And The Deathly Hallows",
                "Rowling's genius is not just her total realisation of a fantasy world,\n" +
                        " but the quieter skill of creating characters that bounce off the page, real and flawed and brave and lovable",
                "https://en.wikipedia.org/wiki/Harry_Potter_and_the_Deathly_Hallows"));

        DocumentUtil.findKeyWords(listOfDocuments);
        System.out.println();


        ///////////////////////////////////
        // TODO Task 3

        System.out.println("Task 3");
        List<Figure> listOfFigures = new ArrayList<>();

        listOfFigures.add(new Square(3));
        listOfFigures.add(new Rectangle(4, 6));
        listOfFigures.add(new Circle(4));

        FigureUtil.generalSquare(listOfFigures);
        System.out.println();


        ///////////////////////////////////
        // TODO Task 4

        System.out.println("Task 4");

        Age age = new Age();
        age.dateOfBirth();
        age.ageInDays();
        age.ageInMonths();
        age.dayOfWeekOfBirth();

    }
}
