package com.cell.store.model;

import org.junit.Assert;
import org.junit.Test;

public class CelularTest {
    @Test
    public void criarTelefoneTeste (){
        Celular celular = new Celular();
        Assert.assertEquals("Motorola", celular.getMarca());


    }

}