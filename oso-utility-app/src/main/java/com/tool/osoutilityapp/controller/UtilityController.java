package com.tool.osoutilityapp.controller;

import com.tool.osoutilityapp.customconfig.SectionConfigurations;
import com.tool.osoutilityapp.customconfig.model.Content;
import com.tool.osoutilityapp.exception.CustomizeException;
import com.tool.osoutilityapp.model.UIElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class UtilityController {

    @Autowired(required = false)
    private SectionConfigurations sectionConfigurations;

    @RequestMapping("/osoUtility")
    public String home(Model model) {
        //Main Section Middle
        model.addAttribute("sectionHeadingMain",UIElements.sectionHeadingMain);
        model.addAttribute("element1", UIElements.element_1);
        model.addAttribute("element2",UIElements.element_2);
        model.addAttribute("element3",UIElements.element_3);
        //ELEMENT1/2 Buttons
        model.addAttribute("btne1",UIElements.btne1);
        model.addAttribute("btne2",UIElements.btne2);
        model.addAttribute("btne3",UIElements.btne3);
        model.addAttribute("btne4",UIElements.btne4);
        model.addAttribute("btne5",UIElements.btne5);
        model.addAttribute("btne6",UIElements.btne6);
        model.addAttribute("btne7",UIElements.btne7);
        //ELEMENT3 Buttons
        model.addAttribute("btne31",UIElements.btne31);
        model.addAttribute("btne32",UIElements.btne32);

        //Left Bottom Main Section
        //Elements
        model.addAttribute("sectionHeadingLB",UIElements.sectionHeadingLB);
        model.addAttribute("LBelement1",UIElements.LBelement1);
        model.addAttribute("LBelement2",UIElements.LBelement2);
        model.addAttribute("LBelement3",UIElements.LBelement3);
        model.addAttribute("LBelement4",UIElements.LBelement4);
        model.addAttribute("LBelement5",UIElements.LBelement5);
        model.addAttribute("LBelement6",UIElements.LBelement6);
        model.addAttribute("LBelement7",UIElements.LBelement7);

        //Right Bottom Main Section
        model.addAttribute("sectionHeadingRB",UIElements.sectionHeadingRB);
        model.addAttribute("RBelement1",UIElements.RBelement1);
        model.addAttribute("RBelement2",UIElements.RBelement2);
        model.addAttribute("RBelement3",UIElements.RBelement3);
        model.addAttribute("RBelement4",UIElements.RBelement4);
        model.addAttribute("RBelement5",UIElements.RBelement5);
        model.addAttribute("RBelement6",UIElements.RBelement6);

        //Extreme Left Section
        model.addAttribute("sectionHeadingELB", UIElements.sectionHeadingELB);
        model.addAttribute("LContent1",UIElements.LContent1);
        model.addAttribute("LContent2",UIElements.LContent2);
        model.addAttribute("LContent3",UIElements.LContent3);
        model.addAttribute("LContent4",UIElements.LContent4);
        model.addAttribute("LContent5",UIElements.LContent5);
        model.addAttribute("LContent6",UIElements.LContent6);
        model.addAttribute("LContent7",UIElements.LContent7);
        model.addAttribute("LContent8",UIElements.LContent8);
        model.addAttribute("LContent9",UIElements.LContent9);
        model.addAttribute("LContent10",UIElements.LContent10);
        model.addAttribute("LContent11",UIElements.LContent11);
        model.addAttribute("LContent12",UIElements.LContent12);
        model.addAttribute("LContent13",UIElements.LContent13);
        //Click Here Modal
        model.addAttribute("LClickHere",UIElements.LClickHere);

        //Extreme Right Section
        //First Section
        model.addAttribute("sectionHeadingERS1", UIElements.sectionHeadingERS1);
        model.addAttribute("btnERB11", UIElements.btnERB11);
        model.addAttribute("btnERB12", UIElements.btnERB12);
        model.addAttribute("btnERB13", UIElements.btnERB13);
        //Second Section
        model.addAttribute("sectionHeadingERS2", UIElements.sectionHeadingERS2);
        model.addAttribute("elementERS21",UIElements.elementERS21);
        model.addAttribute("elementERS22",UIElements.elementERS22);
        //Third Section
        model.addAttribute("sectionHeadingERS3", UIElements.sectionHeadingERS3);
        model.addAttribute("elementERS31",UIElements.elementERS31);
        model.addAttribute("elementERS32",UIElements.elementERS32);
        model.addAttribute("elementERS33",UIElements.elementERS33);
        model.addAttribute("hoverERS33",UIElements.hoverERS33);

        return "osoUtility";
    }
    @RequestMapping("/osoUtilityCustomize")
    public String customizeHome(Model model) throws Exception {
        try{
            if(sectionConfigurations!=null) {
                Map<String, List<Content>> section = sectionConfigurations.getSection();
                List<Content> data = sectionConfigurations.getSection().get("headerSection");
                System.out.println(section);
                System.out.println(data);
            }
        }catch (Exception e){
            throw new CustomizeException("Customize content from file not loaded");
        }
        return "customize-utility";
    }
}
