package com.zenviachallenge.caixaeletronico.service;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

public class SaqueServiceTest {

    @Test
    public void realizarSaque() throws Exception {
        SaqueService service = new SaqueService();

        int[] expected = Arrays.stream(new Integer[]{100, 100, 50}).mapToInt(i -> i).toArray();
        int[] current = service.realizarSaque(250).stream().mapToInt(i -> i).toArray();

       assertArrayEquals(expected, current);

    }

    @Test
    public void saqueNaoDisponivel() {
        SaqueService service = new SaqueService();
        try {
            service.realizarSaque(156);
            Assert.fail("Exception");
        } catch(Exception ex) {
            MatcherAssert.assertThat(ex.getMessage(), equalTo("Valor não disponível para saque"));
        }
    }

}