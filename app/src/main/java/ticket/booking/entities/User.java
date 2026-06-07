package ticket.booking.entities;


import java.util.List;

public class User {
        private String name;
        private String password;
        private String userId;
        private String hashPassword;
        List<Ticket> bookedTickets;
}
