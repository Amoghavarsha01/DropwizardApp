//package sampleDropwizard.resources;
//
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import com.service.PersonView;
//
//@Path("/people/{id}")
//@Produces(MediaType.TEXT_HTML)
//public class PersonResource {
//
//    @GET
//    public PersonView getPerson(@PathParam("id") String id) {
//        return new PersonView(dao.find(id));
//    }
//}