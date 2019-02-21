package models;


    import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;


    @Entity

    public class User {


        public String password;



        public enum Role {
            ADMIN,
            USER
        }

        public enum State {
            PENDING,
            VERIFIED,
            LOCKED
        }

        @Id
        @JsonProperty("name")
        private String name;

        @Basic
        @JsonProperty("email")
        private String email;


        @Basic
        @JsonProperty("token")
        private String accessToken;

        @Basic
        @JsonIgnore
        private String passwordHash;

        @Basic
        @JsonIgnore
        private String salt;

        @Basic
        @JsonIgnore
        private Integer hashIterations;

        Role role;
        State state;

        public User() {
            //Important for json serialization
        }



        public User(String name, String email, String password, Role role, State state, String accessToken,String passwordHash,String salt,Integer hashIterations) {

                this.name = name;
                this.passwordHash = passwordHash;
                this.salt = salt;
                this.hashIterations = hashIterations;
                this.email = email;

                this.password = password;

                this.role = role;
                this.state = state;
                this.accessToken = accessToken;

            }

            public String getName() {
                return name;

            }

            public String getEmail() {
                return email;

            }



            public void setHashIterations(int hashIterations) {

                this.hashIterations = hashIterations;
            }

            public void setSalt(String salt) {
                this.salt = salt;
            }

            public void setPasswordHash(String passwordHash) {
                this.passwordHash = passwordHash;

            }

            public String getPassword() {

                //String password;
                return password;

            }

            public void setState(State state) {

                this.state = state;
            }

            public void setRole(Role role) {
                this.role = role;

            }

            public String getSalt() {
                return salt;

            }

            public int getHashIterations() {
                return hashIterations;

            }

            public String getPasswordHash() {

                return passwordHash;
            }

            public State getState() {

                return state;
            }

            public void setAccessToken(String accessToken) {
                this.accessToken = accessToken;
            }

            public Role getRole() {
                return role;

            }

            public String getAccessToken() {
                return accessToken;

            }

            public void setEmail(String email) {
                this.email = email;

            }


        }



