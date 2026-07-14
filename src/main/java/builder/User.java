package builder;

import java.time.LocalDateTime;

/**
 *  Builder Design Patter - CREATIONAL DESIGN PATTERN
 *  Builder design pattern comes under creational design pattern family, it's a standardized way to create
 *  immutable objects using minimal use of constructor parameters and the initialization of state members
 *  depends on the use cases.
 *
 * */
public final class User
{
    //All final attributes
    private final String userName; // required
    private final String password; // required
    private final boolean active; // required
    private final long userId; // optional
    private final String firstName; // optional
    private final String lastName; // optional
    private final LocalDateTime loginTimeStamp; // optional
    private final String authenticationSource; // optional
    private final String personCode; // optional
    private final String companyName; // optional
    private final Integer companyCode; // optional
    private final String designation;// optional

    private User(UserBuilder builder) {
    	this.userName = builder.userName;
        this.password  = builder.password;
        this.active = builder.active;
        this.userId = builder.userId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.loginTimeStamp = builder.loginTimeStamp;
        this.authenticationSource = builder.authenticationSource;
        this.personCode = builder.personCode;
        this.companyName = builder.companyName;
        this.companyCode = builder.companyCode;
        this.designation = builder.designation;
    }

    //All getter, and NO setter to provide immutability
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return active;
    }

    public long getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDateTime getLoginTimeStamp() {
        return loginTimeStamp;
    }

    public String getAuthenticationSource() {
        return authenticationSource;
    }

    public String getPersonCode() {
        return personCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Integer getCompanyCode() {
        return companyCode;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", loginTimeStamp=" + loginTimeStamp +
                ", authenticationSource='" + authenticationSource + '\'' +
                ", personCode='" + personCode + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyCode=" + companyCode +
                ", designation='" + designation + '\'' +
                '}';
    }

    

    static class UserBuilder
    {
        private final String userName; // required
        private final String password; // required
        private final boolean active; // required
        private long userId; // optional
        private String firstName; // optional
        private String lastName; // optional
        private LocalDateTime loginTimeStamp; // optional
        private String authenticationSource; // optional
        private String personCode; // optional
        private String companyName; // optional
        private Integer companyCode; // optional
        private String designation;//
 
        public UserBuilder(String userName, String password, boolean active) {
        	this.userName = userName;
            this.password = password;
            this.active = active;
            this.loginTimeStamp = LocalDateTime.now();
        }
        public UserBuilder userId(long userId) {
            this.userId = userId;
            return this;
        }
        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public UserBuilder authenticationSource(String authenticationSource) {
            this.authenticationSource = authenticationSource;
            return this;
        }
        public UserBuilder personCode(String personCode) {
            this.personCode = personCode;
            return this;
        }
        public UserBuilder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public UserBuilder companyCode(Integer companyCode) {
            this.companyCode = companyCode;
            return this;
        }
        public UserBuilder designation(String designation) {
            this.designation = designation;
            return this;
        }
        //Return the finally consrcuted User object
        public User build() {
            User user =  new User(this);
            validateUserObject(user);
            return user;
        }
        private void validateUserObject(User user) {
            //Do some basic validations to check
            //if user object does not break any assumption of system
        }
    }
    
    public static void main(String[] args) {

        User user1 = new User.UserBuilder("msharma","12345",true)
                .userId(98765)
                .designation("Developer")
                .authenticationSource("OAuth")
                .build();
        System.out.println(user1);

        User user2 = new User.UserBuilder("nsharma","happy",false)
                .userId(342425)
                .designation("Tester")
                .authenticationSource("SAML")
                .companyCode(323)
                .firstName("Nikhil")
                .lastName("Sharma")
                .personCode("323-342425")
                .build();
        System.out.println(user2);

        User user3 = new User.UserBuilder("nsharma","happy",false)
                .userId(342425)
                .designation("Tester")
                .authenticationSource("SAML")
                .companyCode(323)
                .firstName("Nikhil")
                .lastName("Sharma")
                .personCode("323-342425")
                .build();

        System.out.println(user2 == user3);
        System.out.println(user2.equals(user3));
    }
}
