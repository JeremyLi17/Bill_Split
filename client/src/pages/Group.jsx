import React, { useState } from 'react';
import styled from 'styled-components';
import Activity from '../components/Activity';
import AddHomeWorkOutlinedIcon from '@mui/icons-material/AddHomeWorkOutlined';
import PaymentOutlinedIcon from '@mui/icons-material/PaymentOutlined';
import GroupList from '../components/GroupList';
import UploadAct from '../components/UploadAct';

const Container = styled.div`
  display: flex;
`;

const Wrapper = styled.div`
  flex: 8;
  padding: 22px 96px;
  display: flex;
  flex-direction: column;
  text-align: center;
`;

const Title = styled.h1`
  font-size: 40px;
  vertical-align: middle;
`;

const Hr = styled.hr`
  margin: 15px 0px;
  border: 0.5px solid lightgray;
`;

const Memebers = styled.div`
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  flex-wrap: wrap;
  gap: 10px 10px;
`;

const MemeberCard = styled.div`
  width: 150px;
  display: flex;
  flex-direction: row;
  align-items: center;
  background-color: #e2e2e2;
  border-radius: 3px;
  gap: 10px;
  justify-content: space-between;
  padding: 0px 10px;
`;

const SubTitle = styled.h2`
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  font-size: 24px;
  padding-bottom: 20px;
`;

const MemberTitle = styled.h3`
  font-weight: 500;
  font-size: 20px;
`;

const MemberBalance = styled.span`
  font-size: 16px;
`;

const Buttons = styled.div`
  position: relative;
  display: flex;
  align-items: center;
  justify-content: flex-end;
  gap: 30px;
`;

const Button = styled.div`
  display: flex;
  align-items: center;
  gap: 5px;
  padding: 5px 10px;
  background-color: #7fdbff;
  border-radius: 3px;
  cursor: pointer;
`;

const Group = () => {
  const [open, setOpen] = useState(false);

  return (
    <>
      <Container>
        <GroupList />
        <Wrapper>
          <Title>Christmas Hoilday</Title>
          <Hr />
          <SubTitle>Memeber's Balance:</SubTitle>
          <Memebers>
            <MemeberCard>
              <MemberTitle>{'Tom'}:</MemberTitle>
              <MemberBalance>{'160'}$</MemberBalance>
            </MemeberCard>
            <MemeberCard>
              <MemberTitle>{'Tom'}:</MemberTitle>
              <MemberBalance>{'160'}$</MemberBalance>
            </MemeberCard>
            <MemeberCard>
              <MemberTitle>{'Tom'}:</MemberTitle>
              <MemberBalance>{'160'}$</MemberBalance>
            </MemeberCard>
            <MemeberCard>
              <MemberTitle>{'Tom'}:</MemberTitle>
              <MemberBalance>{'160'}$</MemberBalance>
            </MemeberCard>
            <MemeberCard>
              <MemberTitle>{'Tom'}:</MemberTitle>
              <MemberBalance>{'160'}$</MemberBalance>
            </MemeberCard>
          </Memebers>
          <Hr />
          <SubTitle>Activities Details:</SubTitle>
          <Activity />
          <Activity />
          <Activity />
          <Activity />
          <Activity />
          <Hr />
          <Buttons>
            <Button onClick={() => setOpen(true)}>
              <AddHomeWorkOutlinedIcon />
              Add activity
            </Button>
            <Button>
              <PaymentOutlinedIcon />
              Generate Bill
            </Button>
          </Buttons>
        </Wrapper>
      </Container>
      {open && <UploadAct setOpen={setOpen} />}
    </>
  );
};

export default Group;
