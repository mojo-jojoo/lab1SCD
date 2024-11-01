
    public class Customer { 
        private String customerId; 
        private String name; 
        private String address; 
        private int phoneNo; 
        private int age; 
        
        public Customer(String customerId, String name, String address, int phoneNo, int age) { 
            this.customerId = customerId; 
            this.name = name; 
            this.address = address; 
            this.phoneNo = phoneNo; 
            this.age = age; 
        } 
        
        public void modifyDetails() { 
        } 
    }
    
    public class Refund { 
        private float amount; 
        private String customerId; 
        
        public Refund(float amount, String customerId) { 
            this.amount = amount; 
            this.customerId = customerId; 
        } 
        
        public void refundAmount() { 
        } 
    }
    
    public class Agent { 
        private int id; 
        private String name; 
        
        public Agent(int id, String name) { 
            this.id = id; 
            this.name = name; 
        } 
    }
    
    public class Ticket { 
        private String ticketId; 
        private String customerId; 
        private String description; 
        private String issueDate; 
        private String departureDate; 
        private String destination; 
        private float price; 
        private String seatNo; 
        
        public Ticket(String ticketId, String customerId, String description, String issueDate, 
                      String departureDate, String destination, float price, String seatNo) { 
            this.ticketId = ticketId; 
            this.customerId = customerId; 
            this.description = description; 
            this.issueDate = issueDate; 
            this.departureDate = departureDate; 
            this.destination = destination; 
            this.price = price; 
            this.seatNo = seatNo; 
        } 
    }
    
    public class BookingCounter { 
        public BookingCounter() { 
        } 
    }
    
    public class Company { 
        private String name; 
        
        public Company(String name) { 
            this.name = name; 
        } 
        
        public void searchTicket() { 
        } 
        
        public void bookTicket() { 
        } 
        
        public void cancelTicket() { 
        } 
        
        public void updateTicket() { 
        } 
        
        public void display() { 
        } 
        
        public void filterById() { 
        } 
    }
    
    
}
