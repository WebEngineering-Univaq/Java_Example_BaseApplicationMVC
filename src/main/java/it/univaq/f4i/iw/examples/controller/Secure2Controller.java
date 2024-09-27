package it.univaq.f4i.iw.examples.controller;

import it.univaq.f4i.iw.ex.newspaper.data.model.Article;
import it.univaq.f4i.iw.ex.newspaper.data.model.Author;
import it.univaq.f4i.iw.ex.newspaper.data.model.Issue;
import it.univaq.f4i.iw.examples.application.ApplicationDataLayer;
import it.univaq.f4i.iw.examples.application.ApplicationBaseController;
import it.univaq.f4i.iw.framework.data.DataException;
import it.univaq.f4i.iw.framework.security.SecurityHelpers;
import it.univaq.f4i.iw.framework.view.TemplateManagerException;
import it.univaq.f4i.iw.framework.view.TemplateResult;
import java.io.IOException;
import java.time.LocalDate;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Ingegneria del Web
 * @version
 */
public class Secure2Controller extends ApplicationBaseController {

    private void action_default(HttpServletRequest request, HttpServletResponse response) throws IOException, DataException, TemplateManagerException {
        TemplateResult result = new TemplateResult(getServletContext());
        request.setAttribute("page_title", "Very Very Confidential page");
        result.activate("ultrasecure.ftl.html", request, response);
    }

    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        action_default(request, response);
    }
}
