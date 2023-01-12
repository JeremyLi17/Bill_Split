import React from 'react';
import styled from 'styled-components';
import EditOutlinedIcon from '@mui/icons-material/EditOutlined';

const Container = styled.div`
  margin-bottom: 10px;
  display: flex;
  flex-direction: column;
  gap: 10px;
`;

const TitleContainer = styled.div`
  display: flex;
  flex-direction: row;
  align-items: center;
  gap: 10px;
`;

const ActName = styled.h2`
  font-size: 18px;
`;

const ActDate = styled.span`
  font-size: 14px;
`;

const Button = styled.div`
  cursor: pointer;
  gap: 5px;
  display: flex;
  align-items: center;
  background-color: #e3e2e2;
  border-radius: 3px;
  padding: 2px 5px;
`;

const ActMembers = styled.div`
  display: flex;
  flex-direction: row;
  position: relative;
  left: 20px;
  width: 100%;
  gap: 30px;
`;

const Payer = styled.div`
  color: #975c5c;
`;

const ActMember = styled.div`
  color: #4d4dbd;
  font-size: 16px;
`;

const ActDesc = styled.div`
  display: flex;
  flex-direction: row;
  font-size: 14px;
  color: #000000;
  position: relative;
  left: 20px;
  width: 100%;
`;

const Activity = () => {
  return (
    <Container>
      <TitleContainer>
        <ActName>Hotel</ActName>
        <ActDate>2022-12-25</ActDate>
        <Button>
          <EditOutlinedIcon />
          Edit
        </Button>
      </TitleContainer>
      <ActMembers>
        <Payer>
          Payer: {'Jack'} • Amount: {100}$
        </Payer>
        <ActMember>Memebers: {'John'}</ActMember>
      </ActMembers>
      <ActDesc>Description: {"The christmas day's hotel"}</ActDesc>
    </Container>
  );
};

export default Activity;
