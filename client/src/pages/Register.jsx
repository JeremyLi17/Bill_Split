import React from 'react';
import styled from 'styled-components';

const Container = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  height: calc(100vh - 100px);
`;

const Wrapper = styled.div`
  display: flex;
  align-items: center;
  flex-direction: column;
  background-color: #a8a8a8;
  border: 1px solid rgb(208, 208, 208);
  border-radius: 3px;
  padding: 20px 50px;
  gap: 10px;
  width: 40%;
`;

const Title = styled.h1`
  font-size: 24px;
`;

const Input = styled.input`
  border: 1px solid rgb(208, 208, 208);
  border-radius: 3px;
  padding: 10px;
  background-color: transparent;
  width: 100%;
`;

const Button = styled.button`
  border-radius: 3px;
  border: none;
  padding: 10px 20px;
  font-weight: 500;
  cursor: pointer;
  background-color: rgb(208, 208, 208);
`;

const Register = () => {
  return (
    <Container>
      <Wrapper>
        <Title>Create New Account</Title>
        <Input placeholder="Username" required />
        <Input placeholder="Email" type="email" required />
        <Input type="Password" placeholder="password" required />
        <Input placeholder="Comfirmed Password" type="password" required />
        <Button>Register Now</Button>
      </Wrapper>
    </Container>
  );
};

export default Register;
