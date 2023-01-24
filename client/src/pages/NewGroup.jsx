import React, { useState } from 'react';
import styled from 'styled-components';
import GroupList from '../components/GroupList';
import Select from 'react-select';

const Container = styled.div`
  display: flex;
`;

const Wrapper = styled.div`
  flex: 8;
  padding: 22px 44px;
  display: flex;
  flex-direction: column;
  text-align: center;
`;

const Title = styled.h1`
  font-size: 36px;
  font-weight: 600;
  margin-bottom: 10px;
`;

const Hr = styled.hr`
  font-weight: 400;
  font-size: 20px;
  color: #b1b1b1;
`;

const Inputs = styled.div`
  display: flex;
  gap: 10px;
  flex-direction: column;
  justify-content: start;
  margin: 10px;
`;

const Subtitle = styled.h2`
  display: flex;
  flex-direction: row;
  font-size: 28px;
  font-weight: 500;
`;

const Input = styled.input`
  border: 1px solid #6a6a6a;
  border-radius: 3px;
  padding: 10px;
  background-color: transparent;
`;

const Label = styled.label`
  display: flex;
  flex-direction: row;
  font-size: 20px;
`;

const Button = styled.button`
  border-radius: 3px;
  border: none;
  padding: 10px 20px;
  font-weight: 500;
  cursor: pointer;
  background-color: #7fdbff;
  width: auto;
`;

const NewGroup = () => {
  const [members, setMember] = useState([]);
  const handleMultiSelect = (e) => {
    setMember(e.map((select) => select.label));
  };

  const options = [
    { value: 'john', label: 'John' },
    { value: 'alex', label: 'Alex' },
    { value: 'tony', label: 'Tony' },
  ];

  return (
    <Container>
      <GroupList />
      <Wrapper>
        <Title>Create a New Group</Title>
        <Hr />
        <Inputs>
          <Subtitle>Group Name:</Subtitle>
          <Input placeholder="E.g. Christmas Holiday..." type="text" />
          <Subtitle>Members</Subtitle>
          <Select
            type="text"
            options={options}
            isMulti
            onChange={handleMultiSelect}
          />
          <Label>Comfirmed Selected Members: {members.toString()}</Label>
        </Inputs>
        <Button>Submit</Button>
      </Wrapper>
    </Container>
  );
};

export default NewGroup;
