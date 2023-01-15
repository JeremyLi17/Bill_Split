import { BrowserRouter, Routes, Route } from 'react-router-dom';
import styled from 'styled-components';
import Navbar from './components/Navbar';
import Group from './pages/Group';
import Home from './pages/Home';
import Login from './pages/Login';
import NewGroup from './pages/NewGroup';
import Register from './pages/Register';

const Container = styled.div``;

function App() {
  const user = 1;

  return (
    <Container>
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route index element={user ? <Home /> : <Login />} />
          <Route path="/login" element={<Login />} />
          <Route path="/register" element={<Register />} />
          <Route path="/group" element={<Group />} />
          <Route path="/newgroup" element={<NewGroup />} />
        </Routes>
      </BrowserRouter>
    </Container>
  );
}

export default App;
