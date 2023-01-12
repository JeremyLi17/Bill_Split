import React from 'react';
import { Link } from 'react-router-dom';
import styled from 'styled-components';
import GroupCard from './GroupCard';

const Container = styled.div`
  flex: 2;
  height: calc(100vh - 56px);
  position: sticky;
  background-color: #e3e2e2;
`;

const Title = styled.h1`
  font-size: 24px;
  display: flex;
  justify-content: left;
  padding-bottom: 10px;
`;

const Wrapper = styled.div`
  padding: 20px 15px;
  display: flex;
  flex-direction: column;
  gap: 10px;
`;

const GroupList = () => {
  return (
    <Container>
      <Wrapper>
        <Title>Your Groups</Title>
        <Link
          to={`/group`}
          style={{ textDecoration: 'none', color: 'inherit' }}
        >
          <GroupCard groupName={'Christmas Holiday'} />
        </Link>
        <Link
          to={`/group`}
          style={{ textDecoration: 'none', color: 'inherit' }}
        >
          <GroupCard groupName={'Christmas Holiday'} />
        </Link>
        <Link
          to={`/group`}
          style={{ textDecoration: 'none', color: 'inherit' }}
        >
          <GroupCard groupName={'Christmas Holiday'} />
        </Link>
        <Link
          to={`/group`}
          style={{ textDecoration: 'none', color: 'inherit' }}
        >
          <GroupCard groupName={'Christmas Holiday'} />
        </Link>
        <Link
          to={`/group`}
          style={{ textDecoration: 'none', color: 'inherit' }}
        >
          <GroupCard groupName={'Christmas Holiday'} />
        </Link>
      </Wrapper>
    </Container>
  );
};

export default GroupList;
