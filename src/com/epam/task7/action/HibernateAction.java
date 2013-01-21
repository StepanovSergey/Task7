package com.epam.task7.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

/**
 * @author Siarhei_Stsiapanau
 *
 */
public class HibernateAction extends MappingDispatchAction {
    
    
    public ActionForward showMainPage(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
	
	return mapping.findForward("mainPage");
    }

}
