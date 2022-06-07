package org.ged.web;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

import org.ged.entities.AppRole;

import org.ged.service.AppRoleService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {AppRoleController.class})
@ExtendWith(SpringExtension.class)
class AppRoleControllerTest {
    @Autowired
    private AppRoleController appRoleController;

    @MockBean
    private AppRoleService appRoleService;

    /**
     * Method under test: {@link AppRoleController#allrole(String, int, int)}
     */
    @Test
    void testAllrole() throws Exception {
        when(this.appRoleService.allrole((String) any(), anyInt(), anyInt())).thenReturn(new PageImpl<>(new ArrayList<>()));
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/approle");
        MockHttpServletRequestBuilder paramResult = getResult.param("page", String.valueOf(1)).param("role", "foo");
        MockHttpServletRequestBuilder requestBuilder = paramResult.param("size", String.valueOf(1));
        MockMvcBuilders.standaloneSetup(this.appRoleController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"content\":[],\"pageable\":\"INSTANCE\",\"totalElements\":0,\"last\":true,\"totalPages\":1,\"size\":0,\"number"
                                        + "\":0,\"sort\":{\"empty\":true,\"unsorted\":true,\"sorted\":false},\"first\":true,\"numberOfElements\":0,\"empty"
                                        + "\":true}"));
    }

    /**
     * Method under test: {@link AppRoleController#allrole(String, int, int)}
     */
    @Test
    void testAllrole2() throws Exception {
        when(this.appRoleService.allrole((String) any(), anyInt(), anyInt())).thenReturn(new PageImpl<>(new ArrayList<>()));
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/approle");
        getResult.contentType("https://example.org/example");
        MockHttpServletRequestBuilder paramResult = getResult.param("page", String.valueOf(1)).param("role", "foo");
        MockHttpServletRequestBuilder requestBuilder = paramResult.param("size", String.valueOf(1));
        MockMvcBuilders.standaloneSetup(this.appRoleController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string(
                                "{\"content\":[],\"pageable\":\"INSTANCE\",\"totalElements\":0,\"last\":true,\"totalPages\":1,\"size\":0,\"number"
                                        + "\":0,\"sort\":{\"empty\":true,\"unsorted\":true,\"sorted\":false},\"first\":true,\"numberOfElements\":0,\"empty"
                                        + "\":true}"));
    }

    /**
     * Method under test: {@link AppRoleController#getrole(String)}
     */
    @Test
    void testGetrole() throws Exception {
        AppRole appRole = new AppRole();
        appRole.setId(123L);
        appRole.setRole("Role");
        when(this.appRoleService.getrole((String) any())).thenReturn(appRole);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/approle/{id}", "42");
        MockMvcBuilders.standaloneSetup(this.appRoleController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("{\"role\":\"Role\"}"));
    }

    /**
     * Method under test: {@link AppRoleController#getrole(String)}
     */
    @Test
    void testGetrole2() throws Exception {
        AppRole appRole = new AppRole();
        appRole.setId(123L);
        appRole.setRole("Role");
        when(this.appRoleService.getrole((String) any())).thenReturn(appRole);
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/approle/{id}", "42");
        getResult.contentType("https://example.org/example");
        MockMvcBuilders.standaloneSetup(this.appRoleController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("{\"role\":\"Role\"}"));
    }

    /**
     * Method under test: {@link AppRoleController#deleterole(AppRole)}
     */
    @Test
    void testDeleterole() throws Exception {
        doNothing().when(this.appRoleService).deleterole((String) any());

        AppRole appRole = new AppRole();
        appRole.setId(123L);
        appRole.setRole("Role");
        String content = (new ObjectMapper()).writeValueAsString(appRole);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/approle")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(this.appRoleController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    /**
     * Method under test: {@link AppRoleController#createrole(AppRole)}
     */
    @Test
    void testCreaterole() throws Exception {
        doNothing().when(this.appRoleService).addrole((AppRole) any());

        AppRole appRole = new AppRole();
        appRole.setId(123L);
        appRole.setRole("Role");
        String content = (new ObjectMapper()).writeValueAsString(appRole);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/approle")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(this.appRoleController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    /**
     * Method under test: {@link AppRoleController#updaterole(AppRole)}
     */
    @Test
    void testUpdaterole() throws Exception {
        doNothing().when(this.appRoleService).addrole((AppRole) any());

        AppRole appRole = new AppRole();
        appRole.setId(123L);
        appRole.setRole("Role");
        String content = (new ObjectMapper()).writeValueAsString(appRole);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.put("/approle")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(this.appRoleController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}

